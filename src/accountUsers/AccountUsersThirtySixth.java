package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersThirtySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//36-Изменения функционала "Включен" на "Да"   
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
											
		//Открываем "Пользователи аккаунта"
		usersPage.goOptionUsers(driver);
		
		//Удаляем всех пользователей
		usersPage.deleteAllUserSecond(driver);
				
		//Нажимаем Добавить пользователя
		usersPage.buttonAddUser.click();
										
		//Вводим телефон
		usersPage.fieldTelephone.sendKeys(telephone);
										
		//Вводим Имя
		usersPage.fieldName.sendKeys(userName);
										
		//Вводим E-mail
		usersPage.fieldEmail.sendKeys(userMail);
								
		//Устанавливаем СМС-авторизация=Да
		usersPage.fieldSms.sendKeys(smsYes);
				
		//Устанавливаем Активность=Нет
		usersPage.fieldActivity.sendKeys(userIncludNo);
										
		//Выбираем роль Пользователь
		usersPage.buttonRolPolzovatel.click();
										
		//Вводим пароль
		usersPage.fieldPassword.sendKeys(parol);
										
		//Повторяем пароль
		usersPage.fieldRepeatPassword.sendKeys(parol);
										
		//Нажимаем Сохранить
		usersPage.buttonSave.click();
		Thread.sleep(3000);
								
		//Возвращаемся к списку пользователей
		usersPage.buttonBackCreate.click();
		Thread.sleep(1000);		
		
		//Меняем значение колонки "Включен" на Да
		usersPage.fieldActivityTable.sendKeys(userActivityYes);
		Thread.sleep(1000);
		
		//Проверяем результат
		if (countUsers_2 == (usersPage.countUsers(driver)))
			if (userName.equals(usersPage.buttonName.getText()))
				if (userMail.equals(usersPage.labelEmail.getText()))
					if (telephone.equals(usersPage.labelTelephone.getText()))
						if (rolPol.equals(usersPage.labelRolFirst.getText()))
							if (userActivityYes.equals(usersPage.fieldActivityTable.getText()))
								{
								//Открываем Менеджера
								usersPage.buttonNameOpen.click();
								
								//Проверяем
								if (userActivityYes.equals(usersPage.fieldActivity.getText()))
									System.out.println("AccountUsers Thirty-sixth test is pass");
									else
										System.out.println("AccountUsers Thirty-sixth test part №7 is false");
								
								//Возвращаемся к списку пользователей
								usersPage.buttonBackDontCreate.click();
								}
								else
									System.out.println("AccountUsers Thirty-sixth test part №6 is false");
							else
								System.out.println("AccountUsers Thirty-sixth test part №5 is false");
						else
							System.out.println("AccountUsers Thirty-sixth test part №4 is false");
					else
						System.out.println("AccountUsers Thirty-sixth test part №3 is false");
				else
					System.out.println("AccountUsers Thirty-sixth test part №2 is false");
			else
				System.out.println("AccountUsers Thirty-sixth test part №1 is false");
														
		//Удаляем пользователей 
		usersPage.deleteAllUserSecond(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

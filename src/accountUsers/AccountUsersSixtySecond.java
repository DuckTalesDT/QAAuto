package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersSixtySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//62-Создается Менеджер с доступом Запрещено
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
				
		//Устанавливаем Активность=Да
		usersPage.fieldActivity.sendKeys(userIncludYes);
								
		//Выбираем роль Менеджера
		usersPage.buttonRolManager.click();
								
		//Вводим пароль
		usersPage.fieldPassword.sendKeys(parol);
								
		//Повторяем пароль
		usersPage.fieldRepeatPassword.sendKeys(parol);
								
		//Нажимаем Сохранить
		usersPage.buttonSave.click();
		Thread.sleep(3000);
			
		//Выставляем доступ Запрещено
		usersPage.fieldDostup.sendKeys(dostupZapr);
								
		//Возвращаемся к списку пользователей
		usersPage.buttonBackCreate.click();
		Thread.sleep(1000);
				
		//Проверяем результат
		if (countUsers_2 == (usersPage.countUsers(driver)))
			if (userName.equals(usersPage.buttonName.getText()))
				if (userMail.equals(usersPage.labelEmail.getText()))
					if (telephone.equals(usersPage.labelTelephone.getText()))
						if (rolMen.equals(usersPage.labelRolFirst.getText()))
							if (userActivityYes.equals(usersPage.fieldActivityTable.getText()))
								{
								//Открываем Менеджера
								usersPage.buttonNameOpen.click();
								
								//Переходим в раздел Доступа
								usersPage.buttonDostup.click();
													
								//Проверяем результат
								Thread.sleep(1000);
								if (dostupZapr.equals(usersPage.fieldDostup.getText()))
									System.out.println("AccountUsers sixty-second test is pass");
									else
										System.out.println("AccountUsers sixty-second test part №7 is false");
								}
								else
									System.out.println("AccountUsers sixty-second test part №6 is false");
							else
								System.out.println("AccountUsers sixty-second test part №5 is false");
						else
							System.out.println("AccountUsers sixty-second test part №4 is false");
					else
						System.out.println("AccountUsers sixty-second test part №3 is false");
				else
					System.out.println("AccountUsers sixty-second test part №2 is false");
			else
				System.out.println("AccountUsers sixty-second test part №1 is false");
				
		//Возвращаемся к списку пользователей
		usersPage.buttonBackCreate.click();
				
		//Удаляем пользователей 
		usersPage.deleteAllUserSecond(driver);
										
		//Закрываем сайт
		driver.quit();
		
	}
}

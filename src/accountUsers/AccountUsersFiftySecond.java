package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersFiftySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//52-Изменения функционала "Включен" на "Нет" в настройках пользователя
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
											
		//Открываем "Пользователи аккаунта"
		usersPage.goOptionUsers(driver);
		
		//Удаляем всех пользователей
		usersPage.deleteAllUserSecond(driver);
				
		//Добавляем Пользователя
		usersPage.addPolzovatel(driver);
			
		//Открываем Пользователя
		usersPage.buttonNameOpen.click();
				
		//Меняем Включен на Нет
		usersPage.fieldActivity.sendKeys(userIncludNo);
				
		//Нажимаем Сохранить
		usersPage.buttonSave.click();
		Thread.sleep(3000);
								
		//Возвращаемся к списку пользователей
		usersPage.buttonBackDontCreate.click();	
		Thread.sleep(1000);
		
		//Проверяем результат
		Thread.sleep(1000);
		if (countUsers_2 == (usersPage.countUsers(driver)))
			if (userName.equals(usersPage.buttonName.getText()))
				if (userMail.equals(usersPage.labelEmail.getText()))
					if (telephone.equals(usersPage.labelTelephone.getText()))
						if (rolPol.equals(usersPage.labelRolFirst.getText()))
							if (userActivityNo.equals(usersPage.fieldActivityTable.getText()))
								{
								//Открываем Пользователя
								usersPage.buttonNameOpen.click();
								
								//Проверяем результат
								if (userActivityNo.equals(usersPage.fieldActivity.getText()))
									System.out.println("AccountUsers Fifty-second test is pass");
									else
										System.out.println("AccountUsers Fifty-second test part №7 is false");
								
								//Возвращаемся к списку пользователей
								usersPage.buttonBackDontCreate.click();	
								}
								else
									System.out.println("AccountUsers Fifty-second part №6 test is false");
							else
								System.out.println("AccountUsers Fifty-second part №5 test is false");
						else
							System.out.println("AccountUsers Fifty-second part №4 test is false");
					else
						System.out.println("AccountUsers Fifty-second part №3 test is false");
				else
					System.out.println("AccountUsers Fifty-second part №2 test is false");
			else
				System.out.println("AccountUsers Fifty-second part №1 test is false");
														
		//Удаляем пользователей 
		usersPage.deleteAllUserSecond(driver);
										
		//Закрываем сайт
		driver.quit();
				
	}

}

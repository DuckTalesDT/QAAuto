package accountUsers;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersFortySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//46-Нельзя сохранить изменения по юзеру при не заполнении графы "E-mail"
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
											
		//Открываем "Пользователи аккаунта"
		usersPage.goOptionUsers(driver);
		
		//Удаляем всех пользователей
		usersPage.deleteAllUserSecond(driver);
		
		//Добавляем Менеджера
		usersPage.addManager(driver);
		
		//Открываем Менеджера
		usersPage.buttonNameOpen.click();
		
		//Удаляем E-mail
		usersPage.fieldEmail.sendKeys(Keys.END);
		usersPage.fieldEmail.sendKeys(empty_15);
				
		//Нажимаем Сохранить
		usersPage.buttonSave.click();
		Thread.sleep(1000);
						
		//Возвращаемся к списку пользователей
		usersPage.buttonBackDontCreate.click();
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
																
								//Проверяем
								if (userMail.equals(usersPage.fieldEmail.getAttribute("value")))
									System.out.println("AccountUsers Forty-sixth test is pass");
									else
										System.out.println("AccountUsers Forty-sixth test part №7 is false");
								
								//Возвращаемся к списку пользователей
								usersPage.buttonBackDontCreate.click();
								}
								else
									System.out.println("AccountUsers Forty-sixth test part №6 is false");
							else
								System.out.println("AccountUsers Forty-sixth test part №5 is false");
						else
							System.out.println("AccountUsers Forty-sixth test part №4 is false");
					else
						System.out.println("AccountUsers Forty-sixth test part №3 is false");
				else
					System.out.println("AccountUsers Forty-sixth test part №2 is false");
			else
				System.out.println("AccountUsers Forty-sixth test part №1 is false");
								
		//Удаляем пользователей 
		usersPage.deleteAllUserSecond(driver);
										
		//Закрываем сайт
		driver.quit();
				
	}

}

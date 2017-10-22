package accountUsers;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersFortySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//42-Изменение имени в редактировании пользователя
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
		
		//Меняем Имя
		usersPage.fieldName.sendKeys(Keys.END);
		usersPage.fieldName.sendKeys(empty_15);
		usersPage.fieldName.sendKeys(userNameNew);
		
		//Нажимаем Сохранить
		usersPage.buttonSave.click();
		Thread.sleep(3000);
						
		//Возвращаемся к списку пользователей
		usersPage.buttonBackDontCreate.click();	
		Thread.sleep(1000);
				
		//Проверяем результат
		if (countUsers_2 == (usersPage.countUsers(driver)))
			if (userNameNew.equals(usersPage.buttonName.getText()))
				if (userMail.equals(usersPage.labelEmail.getText()))
					if (telephone.equals(usersPage.labelTelephone.getText()))
						if (rolMen.equals(usersPage.labelRolFirst.getText()))
							if (userActivityYes.equals(usersPage.fieldActivityTable.getText()))
								{
								//Открываем Менеджера
								usersPage.buttonNameOpenNew.click();
																
								//Проверяем
								if (userNameNew.equals(usersPage.fieldName.getAttribute("value")))
									System.out.println("AccountUsers Forty-second test is pass");
									else
										System.out.println("AccountUsers Forty-second test part №7 is false");
								
								//Возвращаемся к списку пользователей
								usersPage.buttonBackDontCreate.click();
								}
								else
									System.out.println("AccountUsers Forty-second test part №6 is false");
							else
								System.out.println("AccountUsers Forty-second test part №5 is false");
						else
							System.out.println("AccountUsers Forty-second test part №4 is false");
					else
						System.out.println("AccountUsers Forty-second test part №3 is false");
				else
					System.out.println("AccountUsers Forty-second test part №2 is false");
			else
				System.out.println("AccountUsers Forty-second test part №1 is false");
								
		//Удаляем пользователей 
		usersPage.deleteAllUserSecond(driver);
										
		//Закрываем сайт
		driver.quit();
		
	}

}

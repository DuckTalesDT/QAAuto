package accountUsers;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersThirtyNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//39-Изменение телефона в редактировании пользователя
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
		
		//Меняем номер телефона
		usersPage.fieldTelephone.sendKeys(Keys.END);
		usersPage.fieldTelephone.sendKeys(empty_15);
		usersPage.fieldTelephone.sendKeys(telephoneNew);
		
		//Нажимаем Сохранить
		usersPage.buttonSave.click();
		Thread.sleep(3000);
						
		//Возвращаемся к списку пользователей
		usersPage.buttonBackDontCreate.click();	
		Thread.sleep(1000);
		
		//Проверяем результат
		if (countUsers_2 == (usersPage.countUsers(driver)))
			if (userName.equals(usersPage.buttonName.getText()))
				if (userMail.equals(usersPage.labelEmail.getText()))
					if (telephoneNew.equals(usersPage.labelTelephone.getText()))
						if (rolPol.equals(usersPage.labelRolFirst.getText()))
							if (userActivityYes.equals(usersPage.fieldActivityTable.getText()))
								{
								//Открываем Пользователя
								usersPage.buttonNameOpen.click();
																
								//Проверяем
								if (telephoneNew.equals(usersPage.fieldTelephone.getAttribute("value")))
									System.out.println("AccountUsers Thirty-ninth test is pass");
									else
										System.out.println("AccountUsers Thirty-ninth test part №7 is false");
								
								//Возвращаемся к списку пользователей
								usersPage.buttonBackDontCreate.click();
								}
								else
									System.out.println("AccountUsers Thirty-ninth test part №6 is false");
							else
								System.out.println("AccountUsers Thirty-ninth test part №5 is false");
						else
							System.out.println("AccountUsers Thirty-ninth test part №4 is false");
					else
						System.out.println("AccountUsers Thirty-ninth test part №3 is false");
				else
					System.out.println("AccountUsers Thirty-ninth test part №2 is false");
			else
				System.out.println("AccountUsers Thirty-ninth test part №1 is false");
								
		//Удаляем пользователей 
		usersPage.deleteAllUserSecond(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

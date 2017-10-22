package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersSixtyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//61-Возврат к списку пользователей
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
		
		//Возвращаемся к списку пользователей
		usersPage.buttonBackDontCreate.click();	
		Thread.sleep(1000);
		
		//Проверяем результат
		if (partUsers.equals(usersPage.labelTitle.getText()))
			if (countUsers_1 == (usersPage.countUsers(driver)))
				System.out.println("AccountUsers Sixty-first test is pass");
				else
					System.out.println("AccountUsers Sixty-first test part №2 is false");
			else
				System.out.println("AccountUsers Sixty-first test part №1 is false");
														
		//Удаляем пользователей 
		usersPage.deleteAllUserSecond(driver);
										
		//Закрываем сайт
		driver.quit();
					
	}

}

package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersThirtyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//38-Удаление пользователя
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
										
		//Удаляем Пользователя
		usersPage.deleteSecondUser(driver);
		
		//Проверяем результат
		Thread.sleep(1000);
		if (countUsers_1 == (usersPage.countUsers(driver)))
			System.out.println("AccountUsers Thirty-eighth test is pass");
			else
				System.out.println("AccountUsers Thirty-eighth test is false");
							
		//Удаляем пользователей 
		usersPage.deleteAllUserSecond(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

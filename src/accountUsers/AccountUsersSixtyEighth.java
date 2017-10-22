package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersSixtyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//68-Пользователи с одинаковым Именем создаются
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
											
		//Открываем "Пользователи аккаунта"
		usersPage.goOptionUsers(driver);
		
		//Удаляем всех пользователей
		usersPage.deleteAllUserSecond(driver);
						
		//Создаем 2-х пользователей
		for (int i = 0; i <= 1; i ++){
			usersPage.addUser(driver);
			}
			
		//Проверяем результат
		if (countUsers_3 == (usersPage.countUsers(driver)))
			System.out.println("AccountUsers Sixty-eighth test is pass");
			else
				System.out.println("AccountUsers Sixty-eighth test is false");
			
		//Удаляем пользователей 
		usersPage.deleteAllUserSecond(driver);
										
		//Закрываем сайт
		driver.quit();
		
	}

}

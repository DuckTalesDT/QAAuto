package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersOneHundredTwentyThirdPartTwo extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//123-Все созданные пользователи/менеджеры сохраняются при каждом посещении приложения
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
											
		//Открываем "Пользователи аккаунта"
		usersPage.goOptionUsers(driver);
						
		//Проверяем результат
		if (countUsers_3 == (usersPage.countUsers(driver)))
			System.out.println("AccountUsers One hundred twenty-third test is pass");
			else
				System.out.println("AccountUsers One hundred twenty-third test is false");
														
		//Удаляем пользователей 
		usersPage.deleteAllUserSecond(driver);
												
		//Закрываем сайт
		driver.quit();
				
				
		
	}
}

package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersOneHundredNinteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//119-Просмотр данных администратора
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
											
		//Открываем "Пользователи аккаунта"
		usersPage.goOptionUsers(driver);
								
		//Открываем Администратора
		usersPage.buttonAdminOpen.click();
		
		//Проверяем результат
		if (pageProfile.equals(usersPage.labelTitle.getText()))
			{
			//Возвращаемся к списку пользователей
			usersPage.buttonBackDontCreate.click();
					
			//Проверяем результат
			if (pageProfile.equals(usersPage.labelTitle.getText()))
				System.out.println("AccountUsers One hundred ninteenth test is pass");
				else
					System.out.println("AccountUsers One hundred ninteenth test is false");
			}
			else
				System.out.println("AccountUsers One hundred ninteenth test is false");
				
		//Закрываем сайт
		driver.quit();
	}
}

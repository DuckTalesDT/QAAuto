package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersNintySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//96-Допустимое количесто пользователей при тарифе "Персональный"
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrancePers(driver);
											
		//Открываем "Пользователи аккаунта"
		usersPage.goOptionUsers(driver);
		
		//Удаляем всех пользователей
		usersPage.deleteAllUserSecond(driver);
		
		//Нажимаем Добавить пользователя 
		usersPage.buttonAddUser.click();
		
		//Проверяем результат
		if (promptUsersMore.equals(usersPage.labelPromptMoreUsers.getText()))
			{
			//Нажимаем отменить
			usersPage.buttonDontSave.click();	
			Thread.sleep(1000);
			
			System.out.println("AccountUsers Ninty-sixth test is pass");
			}
			else
				System.out.println("AccountUsers Ninty-sixth test is false");
					
		//Удаляем пользователей 
		usersPage.deleteAllUserSecond(driver);
										
		//Закрываем сайт
		driver.quit();
		
	}
}	

package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersNintyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//98-Допустимое количесто пользователей при тарифе "Оптимальный"
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceOptim(driver);
												
		//Открываем "Пользователи аккаунта"
		usersPage.goOptionUsers(driver);
				
		//Удаляем всех пользователей
		usersPage.deleteAllUserFourth(driver);
		
		//Добавляем 17 пользователя
		for(int i = 0; i<17; i++){
			usersPage.addUser(driver);
		}
				
		//Нажимаем Добавить пользователя 
		usersPage.buttonAddUser.click();
				
		//Проверяем результат
		if (promptUsersMore.equals(usersPage.labelPromptMoreUsers.getText()))
			{
			//Нажимаем отменить
			usersPage.buttonDontSave.click();	
			Thread.sleep(1000);
					
			System.out.println("AccountUsers Ninty-eighth test is pass");
			}
			else
				System.out.println("AccountUsers Ninty-eighth test is false");
						
		//Удаляем 17 пользователя
		for(int i = 0; i<17; i++){
			usersPage.deleteFourthUser(driver);
		}
		
		//Удаляем пользователей 
		usersPage.deleteAllUserFourth(driver);
										
		//Закрываем сайт
		driver.quit();
			
	}
}	

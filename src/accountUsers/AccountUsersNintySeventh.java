package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersNintySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//97-Допустимое количество пользователей при тарифе "Стандартный"
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceStand(driver);
													
		//Открываем "Пользователи аккаунта"
		usersPage.goOptionUsers(driver);
				
		//Удаляем всех пользователей
		usersPage.deleteAllUserFourth(driver);
		
		//Добавляем 3 пользователя
		for(int i = 0; i<3; i++){
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
					
			System.out.println("AccountUsers Ninty-seventh test is pass");
			}
			else
				System.out.println("AccountUsers Ninty-seventh test is false");
					
		//Удаляем 3 пользователя
		for(int i = 0; i<3; i++){
			usersPage.deleteFourthUser(driver);
		}
		
		//Удаляем пользователей 
		usersPage.deleteAllUserFourth(driver);
										
		//Закрываем сайт
		driver.quit();
		
	}
}	

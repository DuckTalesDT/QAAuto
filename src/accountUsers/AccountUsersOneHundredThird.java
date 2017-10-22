package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersOneHundredThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//103-Получение сообщения при превышении Max допустимого количества пользователей при тарифе "Максимальный"
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceMaxim(driver);
											
		//Открываем "Пользователи аккаунта"
		usersPage.goOptionUsers(driver);
								
		//Удаляем всех пользователей
		usersPage.deleteAllUserFourth(driver);
				
		//Добавляем 47 пользователя
		for(int i = 0; i<47; i++){
			usersPage.addUser(driver);
		}
				
		//Нажимаем Добавить пользователя 
		usersPage.buttonAddUser.click();
						
		//Проверяем результат
		if (promptUsersMore.equals(usersPage.labelPromptMoreUsers.getText()))
			System.out.println("AccountUsers One hundred third test is pass");
			else
				System.out.println("AccountUsers One hundred third test is false");
		
		//Нажимаем отменить
		usersPage.buttonDontSave.click();
		
		//Удаляем 47 пользователя
		for(int i = 0; i<47; i++){
			usersPage.deleteFourthUser(driver);
		}
		
		//Удаляем пользователей 
		usersPage.deleteAllUserFourth(driver);
										
		//Закрываем сайт
		driver.quit();
			
	}
}	

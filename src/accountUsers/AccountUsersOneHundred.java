package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersOneHundred extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//100-Получение сообщения при превышении Max допустимого количества пользователей при тарифе "Персональный"
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
			System.out.println("AccountUsers One hundred test is pass");
			else
				System.out.println("AccountUsers One hundred test is false");
							
		//Нажимаем отменить
		usersPage.buttonDontSave.click();
		Thread.sleep(1000);
			
		//Удаляем пользователей 
		usersPage.deleteAllUserSecond(driver);
										
		//Закрываем сайт
		driver.quit();
		
	}
}	

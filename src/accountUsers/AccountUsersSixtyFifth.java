package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersSixtyFifth extends Variables {
		
	@Test
	public void test() throws InterruptedException{
		//65-Наличие всплывающего сообщение о возможностях менеджера
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
				
		//Получаем текст подсказки
		String toolTipText = usersPage.getPromptManager(driver);
								
		//Проверяем результат
		if (promptManager.equals(toolTipText))
			System.out.println("AccountUsers Sixty-fifth test is pass");
			else
				System.out.println("AccountUsers Sixty-fifth test is false");
				
		//Возвращаемся к списку пользователей
		usersPage.buttonBackDontCreate.click();	
														
		//Удаляем пользователей 
		usersPage.deleteAllUserSecond(driver);
										
		//Закрываем сайт
		driver.quit();
		
		
	}

}

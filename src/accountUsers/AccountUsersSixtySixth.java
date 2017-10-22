package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersSixtySixth extends Variables {
		
	@Test
	public void test() throws InterruptedException{
		//66-Наличие всплывающего сообщение о возможностях пользователя
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
		String toolTipText = usersPage.getPromptPolzovatel(driver);
										
		//Проверяем результат
		if (promptPolzovatel.equals(toolTipText))
			System.out.println("AccountUsers Sixty-sixth test is pass");
			else
				System.out.println("AccountUsers Sixty-sixth test is false");
				
		//Возвращаемся к списку пользователей
		usersPage.buttonBackDontCreate.click();	
														
		//Удаляем пользователей 
		usersPage.deleteAllUserSecond(driver);
										
		//Закрываем сайт
		driver.quit();
		
	}

}

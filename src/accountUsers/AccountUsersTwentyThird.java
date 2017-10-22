package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersTwentyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//23-Просмотр данных менеджера
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
											
		//Открываем "Пользователи аккаунта"
		usersPage.goOptionUsers(driver);
		
		//Удаляем всех пользователей
		usersPage.deleteAllUserSecond(driver);
			
		//Добавляем менеджера
		usersPage.addManager(driver);
		
		//Открываем Менеджера
		usersPage.buttonNameOpen.click();
		Thread.sleep(1000);
				
		//Проверяем результат
		if (promptUserOpen.equals(usersPage.labelTitle.getText()))
			{
			//Возвращаемся к списку пользователей
			usersPage.buttonBackDontCreate.click();
			Thread.sleep(1000);
					
			//Проверяем результат
			if (partUsers.equals(usersPage.labelTitle.getText()))
				System.out.println("AccountUsers Twenty-third test is pass");
				else
					System.out.println("AccountUsers Twenty-third test part №2 is false");
			}
			else
				System.out.println("AccountUsers Twenty-third test part №1 is false");
				
		//Удаляем пользователей 
		usersPage.deleteAllUserSecond(driver);
								
		//Закрываем сайт
		driver.quit();
	}
}

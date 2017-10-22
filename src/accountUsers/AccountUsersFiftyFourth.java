package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersFiftyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//54-Внесение комментария
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
											
		//Открываем "Пользователи аккаунта"
		usersPage.goOptionUsers(driver);
		
		//Удаляем всех пользователей
		usersPage.deleteAllUserSecond(driver);
		
		//Добавляем Пользователя
		usersPage.addPolzovatel(driver);
		
		//Открываем Пользователя
		usersPage.buttonNameOpen.click();
		
		//Вносим комментария
		usersPage.fieldComment.sendKeys(userComment);
		
		//Нажимаем Сохранить
		usersPage.buttonSave.click();
		Thread.sleep(3000);
						
		//Возвращаемся к списку пользователей
		usersPage.buttonBackDontCreate.click();	
		
		//Открываем Пользователя
		usersPage.buttonNameOpen.click();
		
		//Проверяем результат
		if (userComment.equals(usersPage.fieldComment.getText()))
			System.out.println("AccountUsers Fifty-fourth test is pass");
			else
				System.out.println("AccountUsers Fifty-fourth test is false");
		
		//Возвращаемся к списку пользователей
		usersPage.buttonBackDontCreate.click();	
														
		//Удаляем пользователей 
		usersPage.deleteAllUserSecond(driver);
										
		//Закрываем сайт
		driver.quit();
		
	}

}

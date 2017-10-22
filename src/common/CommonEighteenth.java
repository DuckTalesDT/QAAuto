package common;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.MainPage;
import forTests.Variables;

public class CommonEighteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//18-Названия "Псевдоним или название организации" на странице регистрации и на странице клиента соответствуют
		EntrancePage entrancePage = new EntrancePage();
		MainPage mainPage = new MainPage();
																		
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
								
		//Проверяем результат
		if (home.equals(mainPage.fieldName.getText()))
			System.out.println("Common Eighteenth test is pass");
			else
				System.out.println("Common Eighteenth test is false");
						
		//Закрываем сайт
		driver.quit();
	}

}

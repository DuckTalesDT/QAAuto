package common;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.MainPage;
import forTests.Variables;

public class CommonTwentieth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 20-Имеется иконка "Выход из программы"
		EntrancePage entrancePage = new EntrancePage();
		MainPage mainPage = new MainPage();
																		
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
												
		//Проверяем результат
		if(mainPage.buttonExit.isEnabled())
			System.out.println("Common Twentieth test is pass");
			else
				System.out.println("Common Twentieth test is false");
										
		//Звкрываем сайт
		driver.quit();
	}

}

package common;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.MainPage;
import forTests.Variables;

public class CommonSixteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 16-Имеется информация о версии продукта
		EntrancePage entrancePage = new EntrancePage();
		MainPage mainPage = new MainPage();
																		
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
								
		//Проверяем результат
		if (infoReliz.equals(mainPage.labelVersion.getText()))
			System.out.println("Common Sixteenth test is pass");
			else
				System.out.println("Common Sixteenth test is false");

		//Зaкрываем сайт
		driver.quit();
	}

}

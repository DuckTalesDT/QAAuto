package common;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.MainPage;
import forTests.Variables;

public class CommonFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//1-Запускается строка приветствия
		EntrancePage entrancePage = new EntrancePage();
		MainPage mainPage = new MainPage();
																				
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
				
		//Нажимаем на логотип "finance controlling"
		mainPage.buttonLogo.click();
								
		//Проверяем результат
		if (textHello.equals(mainPage.labelTitle.getText()))
			System.out.println("Common First test is pass");
			else
				System.out.println("Common First test is false");
		
		//Закрываем сайт
		driver.quit();
	}

}

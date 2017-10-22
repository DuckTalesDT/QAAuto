package common;

import java.util.Set;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.MainPage;
import forTests.Variables;

public class CommonSecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//2-Переход из личного кабинета на сайт "Finance-controlling"
		EntrancePage entrancePage = new EntrancePage();
		MainPage mainPage = new MainPage();
																		
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
				
		//Нажимаем "О сервисе"
		mainPage.buttonAboutService.click();
		
		//Получаем текст
		String handle = driver.getWindowHandle();
		Set <String> handles = driver.getWindowHandles();
		for (String hnd : handles){
			if (!hnd.equals(handle)){
				driver.switchTo().window(hnd);
			}
		};
		
		//Проверяем результат
		Thread.sleep(1000);
		if (partEntranceFinanceControlling.equals(mainPage.buttonSyteEntrance.getText()))
			System.out.println("Common Second test is pass");
			else
				System.out.println("Common Second test is false");
				
		//Закрываем страницу
		driver.quit();
		
	}

}

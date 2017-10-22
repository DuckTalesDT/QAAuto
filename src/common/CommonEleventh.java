package common;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import forTests.EntrancePage;
import forTests.Variables;

public class CommonEleventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 11-Имеется раздел "Центры учета"
		EntrancePage entrancePage = new EntrancePage();
																				
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
								
		//Разворачиваем "Центры учета"
		Actions builder = new Actions (driver);
		builder.moveToElement(driver.findElement(By.xpath(optionAll))).perform();
						
		//Проверяем результат
		Thread.sleep(1000);
		if(partCenters.equals(driver.findElement(By.xpath(optionCenters)).getText()))
			System.out.println("Common Eleventh test is pass");
			else
				System.out.println("Common Eleventh test is false");
											
		//Закрываем сайт
		driver.quit();
	}

}

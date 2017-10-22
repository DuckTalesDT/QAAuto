package common;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import forTests.EntrancePage;
import forTests.Variables;

public class CommonNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 9-Имеется раздел "Информация о тарифах"
		EntrancePage entrancePage = new EntrancePage();
																				
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
								
		//Разворачиваем "Информация о тарифах"
		Actions builder = new Actions (driver);
		builder.moveToElement(driver.findElement(By.xpath(optionTarif))).perform();
						
		//Проверяем результат
		Thread.sleep(1000);
		if(partTarifInfo.equals(driver.findElement(By.xpath(optionAboutTarif)).getText()))
			System.out.println("Common Ninth test is pass");
			else
				System.out.println("Common Ninth test is false");
		
		//Звкрываем сайт
		driver.quit();
	}

}

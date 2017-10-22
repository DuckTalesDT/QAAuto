package common;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import forTests.EntrancePage;
import forTests.Variables;

public class CommonThirteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//13-Имеется раздел "Настройки аккаунта"
		EntrancePage entrancePage = new EntrancePage();
																		
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
				
		//Разворачиваем "Настройки аккаунта"
		Actions builder = new Actions (driver);
		builder.moveToElement(driver.findElement(By.xpath(optionAll))).perform();
											
		//Проверяем результат
		Thread.sleep(1000);
		if(partAccountSetting.equals(driver.findElement(By.xpath(optionAccountSettinth)).getText()))
			System.out.println("Common Thirteenth test is pass");
			else
				System.out.println("Common Thirteenth test is false");
			
		//Звкрываем сайт
		driver.quit();
	}

}

package common;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import forTests.EntrancePage;
import forTests.Variables;

public class CommonTwelfth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 12-Имеется раздел "Пользователи аккаунта"
		EntrancePage entrancePage = new EntrancePage();
																		
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
								
		//Разворачиваем "Пользователи аккаунта"
		Actions builder = new Actions (driver);
		builder.moveToElement(driver.findElement(By.xpath(optionAll))).perform();
				
		//Проверяем результат
		Thread.sleep(1000);
		if(partUsersAccount.equals(driver.findElement(By.xpath(optionUsers)).getText()))
			System.out.println("Common Twelfth test is pass");
			else
				System.out.println("Common Twelfth test is false");
						
		//Звкрываем сайт
		driver.quit();
	}

}

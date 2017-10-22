package common;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import forTests.EntrancePage;
import forTests.Variables;

public class CommonFifteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 15-Имеется раздел "Редактирование профиля"
		EntrancePage entrancePage = new EntrancePage();
																				
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
						
		//Разворачиваем "Редактирование профиля"
		Actions builder = new Actions (driver);
		builder.moveToElement(driver.findElement(By.xpath(optionAll))).perform();
						
		//Проверяем результат
		Thread.sleep(1000);
		if(partEditingProfile.equals(driver.findElement(By.xpath(optionEditingProfile)).getText()))
			System.out.println("Common Fifteenth test is pass");
			else
				System.out.println("Common Fifteenth test is false");
		
		//Звкрываем сайт
		driver.quit();
	}

}

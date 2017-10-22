package common;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.EntrancePage;
import forTests.Variables;

public class CommonSeventeenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//17-Имеется информация о бесплатной консультации
		EntrancePage entrancePage = new EntrancePage();
																		
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
														
		//Проверяем результат
		if (infoConsultationFirst.equals(driver.findElement(By.xpath("//span[@class='phone' and text()='0 800 210-638']")).getText()))
			if (infoConsultationSecond.equals(driver.findElement(By.xpath("//span[@class='under-text' and text()='Бесплатная консультация']")).getText()))
				System.out.println("Rate Seventeenth test is pass");
				else
					System.out.println("Rate Seventeenth test part №2 is false");
			else
				System.out.println("Rate Seventeenth test part №1 is false");
				
		//Закрываем сайт
		driver.quit();
	}

}

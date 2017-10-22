package salesForecast;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredTwentyNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//129-При переходе между центрами учета данные меняются
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
		
		//Добавляем 2 ЦУ
		centersPage.addCenterThisMonth(driver);
		centersPage.addCenterThisMonth(driver);
		
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
								
		//Вводим значения в ЦУ №1
		pvPage.fieldCenterFirst.click();
		Thread.sleep(3000);
		pvPage.fieldPlan_1.sendKeys(empty_15);
		pvPage.fieldPlan_1.sendKeys(dataCeloe_1000);
		pvPage.labelTitle.click();
		Thread.sleep(3000);
		pvPage.fieldKassa_1.sendKeys(data_1000);
		pvPage.fieldKassa_1.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		//Вводим значения в ЦУ №2
		pvPage.fieldCenterSecond.click();
		Thread.sleep(3000);
		pvPage.fieldPlan_2.sendKeys(empty_15);
		pvPage.fieldPlan_2.sendKeys(dataCeloe_2000);
		pvPage.labelTitle.click();
		Thread.sleep(3000);
		pvPage.fieldKassa_1.sendKeys(data_2000);
		pvPage.fieldKassa_1.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		//Выбираем ЦУ №1
		pvPage.fieldCenterFirst.click();
		Thread.sleep(3000);
		
		//Проверяем результат
		if (dataCeloe_1000.equals(pvPage.fieldPlan_1.getAttribute("value")))
			if (data_1000.equals(pvPage.fieldKassa_1.getAttribute("value")))
				{
				//Выбираем 2-й ЦУ
				pvPage.fieldCenterSecond.click();
				Thread.sleep(3000);
				
				//Проверяем результат
				if (dataCeloe_2000.equals(pvPage.fieldPlan_2.getAttribute("value")))
					if (data_2000.equals(pvPage.fieldKassa_1.getAttribute("value")))
						System.out.println("SalesForecast One hundred twenty-ninth test is pass");
						else
							System.out.println("SalesForecast One hundred twenty-ninth test part №4 is false");
					else
						System.out.println("SalesForecast One hundred twenty-ninth test part №3 is false");
				}
				else
					System.out.println("SalesForecast One hundred twenty-ninth test part №2 is false");
			else
				System.out.println("SalesForecast One hundred twenty-ninth test part №1 is false");
				
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

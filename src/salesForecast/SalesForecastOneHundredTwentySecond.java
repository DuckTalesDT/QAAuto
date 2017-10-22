package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredTwentySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//122-График в Продажи за прошлый период имеет название центра учета
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
		
		//Создаем ЦУ
		centersPage.addCenterThisMonth(driver);
						
		//Открываем "Прогноз выручки"
		pvPage.optionPv(driver);
				
		//Открываем "Продажи за прошлый период"
		pvPage.buttonSalesPeriodOpen.click();
		Thread.sleep(1000);
			
		//Проверяем результат
		if (centerName.equals(pvPage.fieldSalesPeriodCenterName.getText()))
			System.out.println("SalesForecast One hundred twenty-second test is pass");
			else
				System.out.println("SalesForecast One hundred twenty-second test part №2 is false");
		
		//Закрываем окно
		pvPage.buttonSalesPeriodClose.click();
				
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

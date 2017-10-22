package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredSeventeenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//117-Открывается Продажи за прошлый период
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Создаем ЦУ
		centersPage.addCenterThisMonth(driver);
				
		//Открываем "Прогноз выручки"
		pvPage.optionPv(driver);
		
		//Открываем "Продажи за прошлый период"
		pvPage.buttonSalesPeriodOpen.click();
		
		//Проверяем результат
		Thread.sleep(3000);
		if (partGrafikPeriod.equals(pvPage.labelSalesPeriodTitle.getText()))
			System.out.println("SalesForecast One hundred seventeenth test is pass");
			else
				System.out.println("SalesForecast One hundred seventeenth test is false");
		
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

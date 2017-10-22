package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredEighteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//118-Продажи за прошлый период отображают все созданные центры учета
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
		
		//Создаем 2 ЦУ за прошлый и настоящий периоды
		centersPage.addCenterThisMonth(driver);
		centersPage.addCenterBeforeMonth(driver);
						
		//Открываем "Прогноз выручки"
		pvPage.optionPv(driver);
				
		//Открываем "Продажи за прошлый период"
		pvPage.buttonSalesPeriodOpen.click();
		Thread.sleep(1000);
		
		//Разворачиваем перечень центров учета
		pvPage.buttonSalesPeriodCenters.click();
		
		//Проверяем результат
		if (countCenters_2 == (pvPage.countSalesPeriodCountCenters(driver)))
			if (centerName.equals(pvPage.fieldSalesPeriodCenterFirst.getText()))
				if (centerName.equals(pvPage.fieldSalesPeriodCenterSecond.getText()))
					System.out.println("SalesForecast One hundred eighteenth test is pass");
					else
						System.out.println("SalesForecast One hundred eighteenth test part №3 is false");
				else
					System.out.println("SalesForecast One hundred eighteenth test part №2 is false");
			else
				System.out.println("SalesForecast One hundred eighteenth test part №1 is false");
		
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

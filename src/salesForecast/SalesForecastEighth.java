package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//8-Центр учета с существующим названием создается
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
		
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
				
		//Создаем 2 ЦУ за текущий месяц
		pvPage.addCenterThisMonth(driver);
		pvPage.addCenterThisMonth(driver);
				
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
		
		//Проверяем результат
		if (countCenters_2 == (pvPage.countCenters(driver)))
			if (centerName.equals(pvPage.fieldCenterFirst.getText()))
				if (centerName.equals(pvPage.fieldCenterFirst.getText()))
					System.out.println("SalesForecast Eighth test is pass");
					else
						System.out.println("SalesForecast Eighth test part №3 is false");
				else
					System.out.println("SalesForecast Eighth test part №2 is false");
			else
				System.out.println("SalesForecast Eighth test part №1 is false");
			
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

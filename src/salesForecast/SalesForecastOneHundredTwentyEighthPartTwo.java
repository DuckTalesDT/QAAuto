package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredTwentyEighthPartTwo extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//128-Все последние изменения сохраняются при каждом посещении приложения
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
				
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
		
		//Проверяем результат
		if (dataCeloe_1000.equals(pvPage.fieldPlan_1.getAttribute("value")))
			if (data_1000.equals(pvPage.fieldKassa_1.getAttribute("value")))
				{
				//Открываем коэффициент сезонности
				pvPage.buttonKoefficientOpen.click();
				Thread.sleep(1000);
				
				//Проверяем результат
				if (data_2.equals(pvPage.fieldKoefficient_1.getAttribute("value")))
					System.out.println("SalesForecast One hundred twenty-eighth test is pass");
					else
						System.out.println("SalesForecast One hundred twenty-eighth test part №3 is false");
				
				//Закрываем коэффициент сезонности
				pvPage.buttonKoefficientClose.click();
				}
				else
					System.out.println("SalesForecast One hundred twenty-eighth test part №2 is false");
			else
				System.out.println("SalesForecast One hundred twenty-eighth test part №1 is false");
				
				
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
		
	}
}

package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastTwentySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//27-Внесение значения в колонку план
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
				
		//Создаем ЦУ за текущий месяц
		pvPage.addCenterThisMonth(driver);
				
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
	
		//Вводим значение в План
		pvPage.inputPlanFirst_1000(driver);
				
		//Проверяем результат
		if (dataCeloe_1000.equals(pvPage.fieldPlan_1.getAttribute("value")))
			System.out.println("SalesForecast Twenty-seventh test is pass");
			else
				System.out.println("SalesForecast Twenty-seventh test is false");
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastTwentyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//28-В колонку план вносятся только целые значения
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
		pvPage.fieldPlan_1.sendKeys(empty_15);
		pvPage.fieldPlan_1.sendKeys(data_1000);
		pvPage.labelTitle.click();
		Thread.sleep(3000);
				
		//Проверяем результат
		if (dataCeloe_1000.equals(pvPage.fieldPlan_1.getAttribute("value")))
			System.out.println("SalesForecast Twenty-eighth test is pass");
			else
				System.out.println("SalesForecast Twenty-eighth test is false");
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

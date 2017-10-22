package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastTwentySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//22-Наличие галочки "За прошлый период" при создании центра учета
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
		
		//Нажимаем "Добавить центр учета"
		pvPage.buttonAddCenter.click();
		
		//Проверяем результат
		if (centersPage.buttonBeforePeriod.isEnabled())
			System.out.println("SalesForecast Twenty-second test is pass");
			else
				System.out.println("SalesForecast Twenty-second test is false");
				
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

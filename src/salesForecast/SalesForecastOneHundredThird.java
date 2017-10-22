package salesForecast;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//103-Касса вносится при нажатии на Enter
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
			
		//Вводим значение в Кассу
		pvPage.fieldKassa_1.sendKeys(data_1000);
		pvPage.fieldKassa_1.sendKeys(Keys.ENTER);
		
		//Проверяем результат
		Thread.sleep(3000);
		if (data_1000.equals(pvPage.fieldKassa_1.getAttribute("value")))
			System.out.println("SalesForecast One hundred third test is pass");
			else
				System.out.println("SalesForecast One hundred third test is false");
				
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

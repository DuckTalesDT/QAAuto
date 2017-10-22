package salesForecast;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredSecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//102-План вносится при нажатии на Enter
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
			
		//Вводим значение в План
		pvPage.fieldPlan_1.sendKeys(dataCeloe_1000);
		pvPage.fieldPlan_1.sendKeys(Keys.ENTER);
		
		//Проверяем результат
		Thread.sleep(3000);
		if (dataCeloe_1000.equals(pvPage.fieldPlan_1.getAttribute("value")))
			System.out.println("SalesForecast One hundred second test is pass");
			else
				System.out.println("SalesForecast One hundred second test is false");
				
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

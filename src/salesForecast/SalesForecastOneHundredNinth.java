package salesForecast;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//109-Раздел Прогноз выручки  принимает значение 0
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
		
		//Создаем ЦУ за текущий месяц
		centersPage.addCenterThisMonth(driver);
										
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
			
		//Вводим значение в План
		pvPage.fieldPlan_1.sendKeys(empty_15);
		pvPage.fieldPlan_1.sendKeys(dataCeloe_0);
		pvPage.labelTitle.click();
		Thread.sleep(3000);
			
		//Вводим значение в 1-й день
		pvPage.fieldKassa_1.sendKeys(data_0);
		pvPage.fieldKassa_1.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
			
		//Проверяем результат
		if (dataCeloe_0.equals(pvPage.fieldPlan_1.getAttribute("value")))
			if (data_0.equals(pvPage.fieldKassa_1.getAttribute("value")))
				System.out.println("SalesForecast One hundred ninth test is pass");
				else
					System.out.println("SalesForecast One hundred ninth test part №2 is false");
			else
				System.out.println("SalesForecast One hundred ninth test part №1 is false");
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

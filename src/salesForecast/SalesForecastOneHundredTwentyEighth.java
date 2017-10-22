package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredTwentyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//128-Все последние изменения сохраняются при каждом посещении приложения
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
				
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
				
		//Вводим значение в План по ЦУ 
		pvPage.inputPlanFirst_1000(driver);
		
		//Вводим значение в Кассу по ЦУ 
		pvPage.inputKassaFirst_1000(driver);
		
		//Открываем коэффициент сезонности
		pvPage.buttonKoefficientOpen.click();
		Thread.sleep(1000);
				
		//Устанавливаем значение
		pvPage.fieldKoefficient_1.sendKeys(empty_6);
		pvPage.fieldKoefficient_1.sendKeys(data_2);
		pvPage.fieldKoefficientSave.click();
			
		//Закрываем коэффициент сезонности
		pvPage.buttonKoefficientClose.click();
		
		//Закрываем сайт
		driver.quit();
		
	}
}

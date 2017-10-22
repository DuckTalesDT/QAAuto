package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastSeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//7-Возврат в раздел "Центры учета" без содания
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
			
		//Набираем название центра учета
		centersPage.fieldCenterName.sendKeys(centerName);
						
		//Убираем активность "За прошлый месяц"
		if (centersPage.buttonBeforePeriod.isEnabled())
			centersPage.buttonBeforePeriod.click();
						
		//Нажимаем "Отменить"
		centersPage.buttonCenterDontSave.click();
		Thread.sleep(1000);		
		
		//Нажимаем "Прогноз выручки"
		if (countCenters_0 == (centersPage.countCenters(driver)))
			{
			//Нажимаем "Прогноз выручки"
			pvPage.optionPv(driver);
			
			//Проверяем результат
			if (countCenters_0 == (pvPage.countCenters(driver)))
				System.out.println("SalesForecast Seventh test is pass");
				else
					System.out.println("SalesForecast Seventh test part №2 is false");
			}
			else
				System.out.println("SalesForecast Seventh test part №1 is false");
				
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

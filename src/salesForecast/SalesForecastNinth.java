package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//9-Центр учета без заполнения графы "Название" не создается
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
						
		//Не набираем название центра учета
		//centersPage.fieldCenterName.sendKeys(centerName);
						
		//Убираем активность "За прошлый месяц"
		if (centersPage.buttonBeforePeriod.isEnabled())
			centersPage.buttonBeforePeriod.click();
				
		//Нажимаем "Сохранить"
		centersPage.buttonCenterSave.click();
		Thread.sleep(1000);		
		
		//Нажимаем "Отменить"
		centersPage.buttonCenterDontSave.click();	
		Thread.sleep(1000);		
		
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
							
		//Проверяем результат
		if (countCenters_0 == (pvPage.countCenters(driver)))
			System.out.println("SalesForecast Ninth test is pass");
			else
				System.out.println("SalesForecast Ninth test is false");
				
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

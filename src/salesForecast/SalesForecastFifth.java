package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//5-Название центра учета не принимает более 30 символов
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
		centersPage.fieldCenterName.sendKeys(centerNameBigger);
						
		//Убираем активность "За прошлый месяц"
		if (centersPage.buttonBeforePeriod.isEnabled())
			centersPage.buttonBeforePeriod.click();
						
		//Нажимаем "Сохранить"
		centersPage.buttonCenterSave.click();
		Thread.sleep(3000);		
											
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
		
		//Проверяем результат
		if (countCenters_1 == (pvPage.countCenters(driver)))
			if (centerNameSmaller.equals(pvPage.fieldCenterFirst.getText()))
				System.out.println("SalesForecast Fifth test is pass");
				else
					System.out.println("SalesForecast Fifth test part №2 is false");
			else
				System.out.println("SalesForecast Fifth test part №1 is false");
				
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastSixtyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//63-Центры учета расположены в порядке как установлено в разделе "Центры учета"
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
		
		//Нажимаем "Добавить центр учета"
		centersPage.buttonAddCenter.click();
						
		//Набираем название центра учета
		centersPage.fieldCenterName.sendKeys(centerName);
						
		//Убираем активность "За прошлый месяц"
		if (centersPage.buttonBeforePeriod.isEnabled())
			centersPage.buttonBeforePeriod.click();
				
		//Нажимаем "Сохранить"
		centersPage.buttonCenterSave.click();
		Thread.sleep(3000);		
		
		//Нажимаем "Добавить центр учета"
		centersPage.buttonAddCenter.click();
								
		//Набираем название центра учета
		centersPage.fieldCenterName.sendKeys(centerNameSecond);
							
		//Убираем активность "За прошлый месяц"
		if (centersPage.buttonBeforePeriod.isEnabled())
			centersPage.buttonBeforePeriod.click();
						
		//Нажимаем "Сохранить"
		centersPage.buttonCenterSave.click();
		Thread.sleep(3000);		
				
		//Нажимаем "Добавить центр учета"
		centersPage.buttonAddCenter.click();
								
		//Набираем название центра учета
		centersPage.fieldCenterName.sendKeys(centerNameFirst);
								
		//Убираем активность "За прошлый месяц"
		if (centersPage.buttonBeforePeriod.isEnabled())
			centersPage.buttonBeforePeriod.click();
						
		//Нажимаем "Сохранить"
		centersPage.buttonCenterSave.click();
		Thread.sleep(3000);		
		
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
		
		//Проверяем результат
		Thread.sleep(3000);
		if (centerNameFirst.equals(pvPage.fieldCenterFirst.getText()))
			if (centerNameSecond.equals(pvPage.fieldCenterSecond.getText()))
				if (centerName.equals(pvPage.fieldCenterThird.getText()))
					System.out.println("SalesForecast Sixty-third test is pass");
					else
						System.out.println("SalesForecast Sixty-third test part №3 is false");
				else
					System.out.println("SalesForecast Sixty-third test part №2 is false");
			else
				System.out.println("SalesForecast Sixty-third test part №1 is false");
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastTwelfth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//12-Невозможно сохранить центр учета с удаленным названием
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
		
		//Добавляем ЦУ
		pvPage.addCenterThisMonth(driver);
		
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
						
		//Открываем ЦУ
		pvPage.buttonCenterEdit.click();
		
		//Elfkztv название центра учета
		centersPage.fieldCenterName.sendKeys(empty_15);
								
		//Нажимаем "Сохранить"
		centersPage.buttonCenterSave.click();
		Thread.sleep(1000);
		
		//Нажимаем "Отменить"
		centersPage.buttonCenterDontSave.click();
		Thread.sleep(1000);
		
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
		
		//Проверяем результат
		if (countCenters_1 == (pvPage.countCenters(driver)))
			if (centerName.equals(pvPage.fieldCenterFirst.getText()))
				System.out.println("SalesForecast Twelfth test is pass");
				else
					System.out.println("SalesForecast Twelfth test part №2 is false");
			else
				System.out.println("SalesForecast Twelfth test part №1 is false");
			
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

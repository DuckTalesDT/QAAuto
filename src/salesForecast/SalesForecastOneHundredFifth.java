package salesForecast;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//105-Установить "Прогнозировать  по:" >56 дней не возможно
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
		
		//Вносим прогноз
		pvPage.setPrognoz(driver);
					
		//Устанавливаем прогнозировать по 57 первым дням
		pvPage.fieldDayPrognoz.sendKeys(empty_2);
		pvPage.fieldDayPrognoz.sendKeys(dateDays_57);
		pvPage.fieldDayPrognoz.sendKeys(Keys.ENTER);
			
		//Проверяем результат
		Thread.sleep(3000);
		if (dateDays_5.equals(pvPage.fieldDayPrognoz.getAttribute("value")))
			System.out.println("SalesForecast One hundred fifth test is pass");
			else
				System.out.println("SalesForecast One hundred fifth test is false");
				
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

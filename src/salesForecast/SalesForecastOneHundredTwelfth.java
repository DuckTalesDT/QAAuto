package salesForecast;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredTwelfth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//112-Установить "Прогнозировать  по:" 0 дней не возможно
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
		pvPage.fieldDayPrognoz.sendKeys(dateDays_0);
		pvPage.fieldDayPrognoz.sendKeys(Keys.ENTER);
				
		//Проверяем результат
		Thread.sleep(3000);
		if (!dateDays_0.equals(pvPage.fieldDayPrognoz.getAttribute("value")))
			System.out.println("SalesForecast One hundred twelfth test is pass");
			else
				System.out.println("SalesForecast One hundred twelfth test is false");
				
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastThirtyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//34-Таблица касса не принимает иные символы кроме цифр
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
								
		//Создаем ЦУ за текущий месяц
		pvPage.addCenterThisMonth(driver);
								
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
			
		//Вводим значение в 1-й день
		pvPage.fieldKassa_1.sendKeys(empty_15);
		pvPage.fieldKassa_1.sendKeys(dataX);
		
		//Проверяем результат
		if (dataEmpty.equals(pvPage.fieldKassa_1.getAttribute("value")))
			System.out.println("SalesForecast Thirty-fourth test is pass");
			else
				System.out.println("SalesForecast Thirty-fourth test is false");
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

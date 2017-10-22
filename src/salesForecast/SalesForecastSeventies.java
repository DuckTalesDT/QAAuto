package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastSeventies extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//70-Получение подсказки при незаполнении всех данных для формирования графика 
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
					
		//Проверяем результат
		if (promptPVEmptyCassa.equals(pvPage.fieldKassa_1.getAttribute("placeholder")))
			System.out.println("SalesForecast Seventies test is pass");
			else
				System.out.println("SalesForecast Seventies test is false");
				
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

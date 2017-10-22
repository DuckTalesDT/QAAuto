package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastThirtySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//37-Отображение общего плана
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
												
		//Создаем 3 ЦУ за текущий месяц
		int centers;
		for (centers = 0; centers <=2; centers ++){
			centersPage.addCenterThisMonth(driver);
		}
										
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
					
		//Вносим значения для общего плана и активируем его
		pvPage.setTotalPlan(driver);
				
		//Проверяем результат
		if (dataCeloe_3000.equals(pvPage.fieldPlanTotal.getText()))
			System.out.println("SalesForecast Thirty-seventh test is pass");
			else
				System.out.println("SalesForecast Thirty-seventh test is false");
			
		//Де-активируем "Общий прогноз"
		pvPage.buttonTotalPrognoz.click();
		Thread.sleep(3000);
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

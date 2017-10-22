package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastFortyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//45-Верность расчета соотношения %
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
		
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
				
		//Добавляем ЦУ
		centersPage.addCenterThisMonth(driver);
				
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
				
		//Вводим значение в План
		pvPage.fieldPlan_1.sendKeys(empty_15);
		pvPage.fieldPlan_1.sendKeys(dataCeloe_25000);
		pvPage.labelTitle.click();
		Thread.sleep(3000);
		
		//Вводим значение в прогноз
		pvPage.setPrognoz(driver);
		
		//Получаем количество дней
		Thread.sleep(3000);
		int date = pvPage.countDays(driver);
		
		//Выводим значение для результата
		Thread.sleep(1000);
		String data_Percent = "0";
		if (date == 28)
			data_Percent = dataPercent_112;
			else if (date == 29)
				data_Percent = dataPercent_116;
				else if (date == 30)
					data_Percent = dataPercent_120;
					else if (date == 31)
						data_Percent = dataPercent_124;
						
		//Проверяем результат
		if (data_Percent.equals(pvPage.fieldPlanPersent.getText()))
			System.out.println("SalesForecast Forty-fifth test is pass");
			else
				System.out.println("SalesForecast Forty-fifth test is false");
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

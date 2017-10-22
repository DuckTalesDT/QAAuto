package salesForecast;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastSixtySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//66-При переходе с месяца на месяц данные таблицы меняются 
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
		
		//Добавляем ЦУ
		centersPage.addCenterThisMonth(driver);
				
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
	
		//Вводим значение в План
		pvPage.inputPlanFirst_1000(driver);
		
		//Вводим значение в 1-й день
		pvPage.inputKassaFirst_1000(driver);
		
		//Переходим на месяц вперед
		pvPage.goAfterMonth(driver);
		
		//Вводим значение в План
		pvPage.fieldPlan_1.sendKeys(empty_15);
		pvPage.fieldPlan_1.sendKeys(dataCeloe_2000);
		pvPage.labelTitle.click();
		Thread.sleep(3000);
			
		//Вводим значение в кассу
		pvPage.fieldKassa_1.sendKeys(empty_15);
		pvPage.fieldKassa_1.sendKeys(data_2000);
		pvPage.fieldKassa_1.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
				
		//Переходим на месяц назад
		pvPage.goBeforeMonth(driver);
		
		//Проверяем результат
		if (dataCeloe_1000.equals(pvPage.fieldPlan_1.getAttribute("value")))
			if (data_1000.equals(pvPage.fieldKassa_1.getAttribute("value")))
				{
				//Переходим на месяц вперед
				pvPage.goAfterMonth(driver);
				
				//Проверяем
				if (dataCeloe_2000.equals(pvPage.fieldPlan_1.getAttribute("value")))
					if (data_2000.equals(pvPage.fieldKassa_1.getAttribute("value")))
						System.out.println("SalesForecast Sixty-sixth test is pass");
						else
							System.out.println("SalesForecast Sixty-sixth test part №4 is false");
					else
						System.out.println("SalesForecast Sixty-sixth test part №3 is false");
				}
				else
					System.out.println("SalesForecast Sixty-sixth test part №2 is false");
			else
				System.out.println("SalesForecast Sixty-sixth test part №1 is false");
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

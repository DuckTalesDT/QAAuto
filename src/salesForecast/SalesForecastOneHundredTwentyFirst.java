package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredTwentyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//121-Центры учета в Продажи за прошлый период выбираются
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
		
		//Создаем 2 ЦУ за прошлый и настоящий периоды
		{
		//Нажимаем "Добавить центр учета"
		centersPage.buttonAddCenter.click();
					
		//Набираем название центра учета
		centersPage.fieldCenterName.sendKeys(centerNameFirst);
						
		//Устанавливаем активность "За прошлый месяц"
		if (!centersPage.buttonBeforePeriod.isEnabled())
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
		}
						
		//Открываем "Прогноз выручки"
		pvPage.optionPv(driver);
				
		//Открываем "Продажи за прошлый период"
		pvPage.buttonSalesPeriodOpen.click();
		Thread.sleep(1000);
		
		//Разворачиваем перечень центров учета
		pvPage.buttonSalesPeriodCenters.click();
		
		//Выбираем центр учета №1
		pvPage.fieldSalesPeriodCenterFirst.click();
		Thread.sleep(1000);
		
		//Проверяем результат
		if (centerNameSecond.equals(pvPage.fieldSalesPeriodCenterName.getText()))
			{
			//Разворачиваем перечень центров учета
			pvPage.buttonSalesPeriodCenters.click();
			
			//Выбираем центр учета №1
			pvPage.fieldSalesPeriodCenterSecond.click();
			Thread.sleep(1000);
			
			//Проверяем
			if (centerNameFirst.equals(pvPage.fieldSalesPeriodCenterName.getText()))
				System.out.println("SalesForecast One hundred twenty-first test is pass");
				else
					System.out.println("SalesForecast One hundred twenty-first test part №2 is false");
			}
			else
				System.out.println("SalesForecast One hundred twenty-first test part №1 is false");
		
		//Закрываем окно
		pvPage.buttonSalesPeriodClose.click();
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

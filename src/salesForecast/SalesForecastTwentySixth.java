package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastTwentySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//26-Удаленный в текущем месяце центр учета не воспроизводится в последующих и текущем
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
			
		//Удаляем центр учета 
		if (countCenters_1 == (pvPage.countCenters(driver)))
			if (centerName.equals(pvPage.fieldCenterFirst.getText()))
				{
				//Открываем "Центры учета"
				centersPage.goOptionCenters(driver);
				
				//Удаляем ЦУ
				centersPage.deleteAllCenter(driver);
								
				//Нажимаем "Прогноз выручки"
				if (countCenters_0 == (centersPage.countCenters(driver)))
					{
					//Нажимаем "Прогноз выручки"
					pvPage.optionPv(driver);
						
					//Проверяем результат
					//Текущий месяц
					if (countCenters_0 == (pvPage.countCenters(driver)))
						{
						//Переходим в следующий месяц и проверяем там
						pvPage.goAfterMonth(driver);
						
						//Проверяем
						if (countCenters_0 == (pvPage.countCenters(driver)))
							System.out.println("SalesForecast Twenty-Sixth test is pass");
							else
								System.out.println("SalesForecast Twenty-Sixth test part №5 is false");
						}
						else
							System.out.println("SalesForecast Twenty-Sixth test part №4 is false");
					}
					else
						System.out.println("SalesForecast Twenty-Sixth test part №3 is false");
				}
				else
					System.out.println("SalesForecast Twenty-Sixth test part №2 is false");
			else
				System.out.println("SalesForecast Twenty-Sixth test part №1 is false");
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

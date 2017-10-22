package salesForecast;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastNintySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//92-Выручка за месяц в таблице "Касса" считается нарастающим итогом
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
						
		//Вводим значение в 1-5 дни
		pvPage.fieldKassa_1.sendKeys(data_1000);
		pvPage.fieldKassa_1.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		pvPage.fieldKassa_2.sendKeys(data_1000);
		pvPage.fieldKassa_2.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		pvPage.fieldKassa_3.sendKeys(data_1000);
		pvPage.fieldKassa_3.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		pvPage.fieldKassa_4.sendKeys(data_1000);
		pvPage.fieldKassa_4.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		pvPage.fieldKassa_5.sendKeys(data_1000);
		pvPage.fieldKassa_5.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
				
		//Первая проверка
		Thread.sleep(1000);
		if (data_5000.equals(pvPage.fieldKassaTop.getText()))
			{	
			pvPage.fieldKassa_6.sendKeys(data_1000);
			pvPage.fieldKassa_6.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			pvPage.fieldKassa_7.sendKeys(data_1000);
			pvPage.fieldKassa_7.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			pvPage.fieldKassa_8.sendKeys(data_1000);
			pvPage.fieldKassa_8.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			pvPage.fieldKassa_9.sendKeys(data_1000);
			pvPage.fieldKassa_9.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			pvPage.fieldKassa_10.sendKeys(data_1000);
			pvPage.fieldKassa_10.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			
			//Вторая проверка
			Thread.sleep(1000);
			if (data_10000.equals(pvPage.fieldKassaTop.getText()))
				{	
				pvPage.fieldKassa_11.sendKeys(data_1000);
				pvPage.fieldKassa_11.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				pvPage.fieldKassa_12.sendKeys(data_1000);
				pvPage.fieldKassa_12.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				pvPage.fieldKassa_13.sendKeys(data_1000);
				pvPage.fieldKassa_13.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				pvPage.fieldKassa_14.sendKeys(data_1000);
				pvPage.fieldKassa_14.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				pvPage.fieldKassa_15.sendKeys(data_1000);
				pvPage.fieldKassa_15.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				
				//Третья проверка
				Thread.sleep(1000);
				if (data_15000.equals(pvPage.fieldKassaTop.getText()))
					{	
					pvPage.fieldKassa_16.sendKeys(data_1000);
					pvPage.fieldKassa_16.sendKeys(Keys.ENTER);
					Thread.sleep(1000);
					pvPage.fieldKassa_17.sendKeys(data_1000);
					pvPage.fieldKassa_17.sendKeys(Keys.ENTER);
					Thread.sleep(1000);
					pvPage.fieldKassa_18.sendKeys(data_1000);
					pvPage.fieldKassa_18.sendKeys(Keys.ENTER);
					Thread.sleep(1000);
					pvPage.fieldKassa_19.sendKeys(data_1000);
					pvPage.fieldKassa_19.sendKeys(Keys.ENTER);
					Thread.sleep(1000);
					pvPage.fieldKassa_20.sendKeys(data_1000);
					pvPage.fieldKassa_20.sendKeys(Keys.ENTER);
					Thread.sleep(1000);
					
					//Четвертая проверка
					Thread.sleep(1000);
					if (data_20000.equals(pvPage.fieldKassaTop.getText()))
						{	
						pvPage.fieldKassa_21.sendKeys(data_1000);
						pvPage.fieldKassa_21.sendKeys(Keys.ENTER);
						Thread.sleep(1000);
						pvPage.fieldKassa_22.sendKeys(data_1000);
						pvPage.fieldKassa_22.sendKeys(Keys.ENTER);
						Thread.sleep(1000);
						pvPage.fieldKassa_23.sendKeys(data_1000);
						pvPage.fieldKassa_23.sendKeys(Keys.ENTER);
						Thread.sleep(1000);
						pvPage.fieldKassa_24.sendKeys(data_1000);
						pvPage.fieldKassa_24.sendKeys(Keys.ENTER);
						Thread.sleep(1000);
						pvPage.fieldKassa_25.sendKeys(data_1000);
						pvPage.fieldKassa_25.sendKeys(Keys.ENTER);
						Thread.sleep(1000);
						pvPage.fieldPlan_1.sendKeys(Keys.TAB);
						
						//Последняя проверка
						Thread.sleep(1000);
						if (data_25000.equals(pvPage.fieldKassaTop.getText()))
							if (data_25000.equals(pvPage.fieldKassaBottan.getText()))
								System.out.println("SalesForecast Ninty-second test is pass");
								else
									System.out.println("SalesForecast Ninty-second test part №6 is false");
							else
								System.out.println("SalesForecast Ninty-second test part №5 is false");
						}
						else
							System.out.println("SalesForecast Ninty-second test part №4 is false");
					}
					else
						System.out.println("SalesForecast Ninty-second test part №3 is false");
				}
				else
					System.out.println("SalesForecast Ninty-second test part №2 is false");
			}
			else
				System.out.println("SalesForecast Ninty-second test part №1 is false");
				
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

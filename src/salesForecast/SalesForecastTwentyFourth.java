package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;


public class SalesForecastTwentyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//24-Созданный за текущий период центр учета отображается начиная с текущего периода
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
		
		//Нажимаем "Добавить центр учета"
		pvPage.buttonAddCenter.click();
						
		//Набираем название центра учета
		centersPage.fieldCenterName.sendKeys(centerNameMonth);
						
		//Убираем активность "За прошлый месяц"
		if (centersPage.buttonBeforePeriod.isEnabled())
			centersPage.buttonBeforePeriod.click();
		
		//Нажимаем "Сохранить"
		centersPage.buttonCenterSave.click();
		Thread.sleep(3000);		
				
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
		
		//Проверяем результат
		//Текущий месяц
		if (countCenters_1 == (pvPage.countCenters(driver)))
			if (centerNameMonth.equals(pvPage.fieldCenterFirst.getText()))
				{
				//Переходим в следующий месяц
				pvPage.goAfterMonth(driver);
					
				//Проверяем
				if (countCenters_1 == (pvPage.countCenters(driver)))
					if (centerNameMonth.equals(pvPage.fieldCenterFirst.getText()))
						{
						//Переходим в предыдущий месяц 
						pvPage.goBeforeMonth(driver);
						pvPage.goBeforeMonth(driver);
						
						//Проверяем
						if (!centerNameMonth.equals(pvPage.fieldCenterFirst.getText()))
							System.out.println("SalesForecast Twenty-fourth test is pass");
							else
								System.out.println("SalesForecast Twenty-fourth test part №5 is false");
						}
						else
							System.out.println("SalesForecast Twenty-fourth test part №4 is false");
					else
						System.out.println("SalesForecast Twenty-fourth test part №3 is false");
				}
				else
					System.out.println("SalesForecast Twenty-fourth test part №2 is false");
			else
				System.out.println("SalesForecast Twenty-fourth test part №1 is false");
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
								
		//Закрываем сайт
		driver.quit();
	}
}

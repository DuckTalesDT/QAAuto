package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//101-Сумма прогноза по центрам учета в коэффициенте сезонности равна общему значению
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
						
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
		
		//Добавляем 3 ЦУ
		for (int i = 0; i < 3; i++){
			centersPage.addCenterThisMonth(driver);
			}
		
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
		
		//Определяем количество дней
		int date = pvPage.countDays(driver);
					
		//Выводим значение для результата
		Thread.sleep(1000);
		String data = "0";
		if (date == 28)
			data = data_84000;
			else if (date == 29)
				data = data_87000;
				else if (date == 30)
					data = data_90000;
					else if (date == 31)
						data = data_93000;		
							
		//Вводим кассу по ЦУ №1
		pvPage.fieldCenterFirst.click();
		Thread.sleep(3000);
		pvPage.setPrognoz(driver);
				
		//Вводим кассу по ЦУ №2
		pvPage.fieldCenterSecond.click();
		Thread.sleep(3000);
		pvPage.setPrognoz(driver);
						
		//Вводим кассу по ЦУ №3
		pvPage.fieldCenterThird.click();
		Thread.sleep(3000);
		pvPage.setPrognoz(driver);
		
		//Активируем "Общий прогноз"
		pvPage.buttonTotalPrognoz.click();
		Thread.sleep(1000);
						
		//Открываем коэффициент сезонности
		pvPage.buttonKoefficientOpen.click();
		Thread.sleep(1000);
				
		//Проверяем результат
		if (data.equals(pvPage.fieldKoefficientTotalPrognoz.getText()))
			System.out.println("SalesForecast One hundred first test is pass");
			else
				System.out.println("SalesForecast One hundred first test is false");
				
		//Закрываем коэффициент сезонности
		pvPage.buttonKoefficientClose.click();
		
		//Де-активируем "Общий прогноз"
		pvPage.buttonTotalPrognoz.click();
		Thread.sleep(1000);
				
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

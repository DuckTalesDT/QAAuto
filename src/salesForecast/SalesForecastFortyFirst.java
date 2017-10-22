package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastFortyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//41-Отображение общего прогноза
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
		
		//Создаем 3 ЦУ
		for (int i = 0; i <=2; i ++){
			centersPage.addCenterThisMonth(driver);
			}
		
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
		
		//Получаем количество дней в месяце
		int days = pvPage.countDays(driver);
				
		//Выводим значение для результата
		String data = "0";
		if (days == 28)
			data = data_84000;
			else if (days == 29)
				data = data_87000;
				else if (days == 30)
					data = data_90000;
					else if (days == 31)
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
		
		//Проверяем результат
		if (data.equals(pvPage.fieldPrognozTotal.getText()))
			System.out.println("SalesForecast Forty-first test is pass");
			else
				System.out.println("SalesForecast Forty-first test is false");
		
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

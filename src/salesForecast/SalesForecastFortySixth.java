package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.UdpPage;
import forTests.Variables;

public class SalesForecastFortySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//46-Отображение Фактической кассы
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
		UdpPage udpPage = new UdpPage();
						
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
		
		//Создаем ЦУ
		centersPage.addCenterThisMonth(driver);
		
		//Нажимаем "Управление денежными потоками"
		udpPage.optionUdp(driver);
			
		//Находим текущий день
		int today = udpPage.FindToday(driver);
				
		//Определяем значение для проверки
		String data = "";
		if (today < 10)
			data = data_1000;
			else if (today >= 10 && today < 20)
				data = data_2000;
				else if (today >=20 && today < 28)
					data = data_3000;
					else if (today >=28)
						data = data_4000;
		
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
			
		//Вводим кассу
		pvPage.inputKassa(driver);
								
		//Активируем "Фактическая касса"
		pvPage.buttonFactKassa.click();	
		Thread.sleep(1000);
						
		//Проверяем результат
		if (data.equals(pvPage.fieldFactKassa_1.getText()))
			System.out.println("SalesForecast Forty-sixth test is pass");
			else
				System.out.println("SalesForecast Forty-sixth test is false");
		
		//Деактивируем "Фактическая касса"
		pvPage.buttonFactKassa.click();	
		Thread.sleep(1000);
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

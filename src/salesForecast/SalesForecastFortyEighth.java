package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.UdpPage;
import forTests.Variables;

public class SalesForecastFortyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//48-Фактическая касса по центрам учета дает сумму в общюю фактическую кассу
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
		
		//Создаем 3 ЦУ
		for(int i = 0; i < 3; i++){
			centersPage.addCenterThisMonth(driver);
			}
		
		//Нажимаем "Управление денежными потоками"
		udpPage.optionUdp(driver);
			
		//Находим текущий день
		int today = udpPage.FindToday(driver);
				
		//Определяем значение для проверки
		String data = "";
		if (today < 10)
			data = data_3000;
			else if (today >= 10 && today < 20)
				data = data_6000;
				else if (today >=20 && today < 28)
					data = data_9000;
					else if (today >=28)
						data = data_12000;
		
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
					
		//Вводим кассу по ЦУ №1
		pvPage.fieldCenterFirst.click();
		Thread.sleep(3000);
		pvPage.inputKassa(driver);
		
		//Вводим кассу по ЦУ №2
		pvPage.fieldCenterSecond.click();
		Thread.sleep(3000);
		pvPage.inputKassa(driver);
				
		//Вводим кассу по ЦУ №3
		pvPage.fieldCenterThird.click();
		Thread.sleep(3000);
		pvPage.inputKassa(driver);
						
		//Активируем "Фактическая касса"
		pvPage.buttonFactKassa.click();	
		Thread.sleep(1000);
		
		//Активируем "Общий прогноз"
		pvPage.buttonTotalPrognoz.click();	
		Thread.sleep(1000);
						
		//Проверяем результат
		if (data.equals(pvPage.fieldFactKassaTotal.getText()))
			System.out.println("SalesForecast Forty-eighth test is pass");
			else
				System.out.println("SalesForecast Forty-eighth test is false");
		
		//Деактивируем "Фактическая касса"
		pvPage.buttonFactKassa.click();	
		Thread.sleep(1000);
		
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

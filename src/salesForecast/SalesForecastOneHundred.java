package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundred extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//100-Коэффициент сезонности меняет общий прогноз согласно своего значения 
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
		
		//Получаем количество дней
		int date = pvPage.countDays(driver);
				
		//Выводим значение для результата
		String data = "0";
		if (date == 28)
			data = data_56000;
			else if (date == 29)
				data = data_58000;
				else if (date == 30)
					data = data_60000;
					else if (date == 31)
						data = data_62000;
		
		//Вводим кассу в ЦУ
		pvPage.setPrognoz(driver);
		
		//Активируем "Общий прогноз"
		pvPage.buttonTotalPrognoz.click();
		Thread.sleep(1000);
						
		//Открываем коэффициент сезонности
		pvPage.buttonKoefficientOpen.click();
		Thread.sleep(1000);
		
		//Устанавливаем значение
		pvPage.fieldKoefficientTotal.sendKeys(empty_6);
		pvPage.fieldKoefficientTotal.sendKeys(data_2);
		pvPage.fieldKoefficientSave.click();
				
		//Проверяем результат
		if (data.equals(pvPage.fieldKoefficientSaveTotal.getText()))
			{		
			//Закрываем коэффициент сезонности
			pvPage.buttonKoefficientClose.click();
			
			//Обновляем страницу
			driver.navigate().refresh();
			Thread.sleep(3000);
			
			//Открываем коэффициент сезонности
			pvPage.buttonKoefficientOpen.click();
			Thread.sleep(1000);
					
			//Проверяем результат
			if (data.equals(pvPage.fieldKoefficientSaveTotal.getText()))
				System.out.println("SalesForecast One hundred test is pass");
				else
					System.out.println("SalesForecast One hundred part №2 test is false");
			}
			else
				System.out.println("SalesForecast One hundred part №1 test is false");
		
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

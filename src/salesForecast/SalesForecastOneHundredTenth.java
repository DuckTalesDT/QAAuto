package salesForecast;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredTenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//110-Отображение значений в колонке прогноз c внесенными таблицу "Касса" 0
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
		
		//Создаем ЦУ за текущий месяц
		centersPage.addCenterThisMonth(driver);
												
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
		
		//Получаем количество дней в месяце
		int days = pvPage.countDays(driver);
				
		//Выводим значение для результата
		Thread.sleep(1000);
		String data = "0";
		if (days == 28)
			data = "14 300,00";
			else if (days == 30)
				data = "15 300,00";
				else if (days == 31)
					data = "15 800,00";
				
		//Вводим значение в Кассу
		pvPage.fieldKassa_1.sendKeys(data_1000);
		pvPage.fieldKassa_1.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		pvPage.fieldKassa_2.sendKeys(data_0);
		pvPage.fieldKassa_2.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		pvPage.fieldKassa_3.sendKeys(data_1000);
		pvPage.fieldKassa_3.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		pvPage.fieldKassa_4.sendKeys(data_0);
		pvPage.fieldKassa_4.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		pvPage.fieldKassa_5.sendKeys(data_1000);
		pvPage.fieldKassa_5.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		pvPage.fieldKassa_6.sendKeys(data_0);
		pvPage.fieldKassa_6.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		pvPage.fieldKassa_7.sendKeys(data_1000);
		pvPage.fieldKassa_7.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		//Устанавливаем прогнозировать по 5-м первым дням
		pvPage.fieldDayPrognoz.sendKeys(empty_2);
		pvPage.fieldDayPrognoz.sendKeys(dateDays_5);
		pvPage.fieldDayPrognoz.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		//Проверяем результат
		if (data.equals(pvPage.fieldPrognoz_1.getText()))
			System.out.println("SalesForecast One hundred tenth test is pass");
			else
				System.out.println("SalesForecast One hundred tenth test is false");
				
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

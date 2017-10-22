package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastThirtyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//31-Отображение значений в колонке прогноз
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
		
		//Получаем количество дней в месяце
		int days = pvPage.countDays(driver);
				
		//Выводим значение для результата
		String data = "0";
		if (days == 28)
			data = data_28000;
			else if (days == 29)
				data = data_29000;
				else if (days == 30)
					data = data_30000;
					else if (days == 31)
						data = data_31000;
				
		//Вносим прогноз
		pvPage.setPrognoz(driver);
		
		//Проверяем результат
		if (data.equals(pvPage.fieldPrognoz_1.getText()))
			System.out.println("SalesForecast Thirty-first test is pass");
			else
				System.out.println("SalesForecast Thirty-first test is false");
				
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}

}

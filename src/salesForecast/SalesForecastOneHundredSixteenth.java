package salesForecast;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredSixteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//116-Пользователь с доступом "Только чтение" может пользоваться разделом "Коэффициент сезонности"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
				
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrancePolChten(driver);
				
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
												
		//Открываем коэффициент сезонности
		pvPage.buttonKoefficientOpen.click();
		
		//Устанавливаем значение
		pvPage.fieldKoefficient_1.sendKeys(empty_6);
		pvPage.fieldKoefficient_1.sendKeys(data_2);
		pvPage.fieldKoefficientSave.click();
		
		//Проверяем результат
		if (data.equals(pvPage.fieldKoefficientSave.getText()))
			System.out.println("SalesForecast One hundred sixteenth test is pass");
			else
				System.out.println("SalesForecast One hundred sixteenth test is false");
		
		//Закрываем коэффициент сезонности
		pvPage.buttonKoefficientClose.click();
		
		//Закрываем сайт
		driver.quit();
		
	}
}

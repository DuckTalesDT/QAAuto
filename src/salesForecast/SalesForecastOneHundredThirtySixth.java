package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredThirtySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//136-"Коэффициент сезонности" не принимает ничего кроме цифр
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

		//Вводим кассу
		pvPage.setPrognoz(driver);
						
		//Открываем коэффициент сезонности
		pvPage.buttonKoefficientOpen.click();
		Thread.sleep(1000);
		
		//Устанавливаем значение
		pvPage.fieldKoefficient_1.sendKeys(empty_6);
		pvPage.fieldKoefficient_1.sendKeys(dataX);
		pvPage.fieldKoefficientSave.click();
				
		//Проверяем результат
		if (dataEmpty.equals(pvPage.fieldKoefficient_1.getText()))
			System.out.println("SalesForecast One hundred thirty-sixth test is pass");
			else
				System.out.println("SalesForecast One hundred thirty-sixth test is false");
		
		//Закрываем коэффициент сезонности
		pvPage.buttonKoefficientClose.click();
				
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

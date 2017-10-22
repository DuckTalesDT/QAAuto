package salesForecast;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//108-При установки "Прогнозировать  по:" <4 дней график "Прогноз" всплыла подсказка
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
		
		//Вносим прогноз
		pvPage.setPrognoz(driver);
			
		//Устанавливаем прогнозировать по 3 первым дням
		pvPage.fieldDayPrognoz.sendKeys(empty_2);
		pvPage.fieldDayPrognoz.sendKeys(dateDays_3);
		pvPage.fieldDayPrognoz.sendKeys(Keys.ENTER);
		
		//Проверяем результат  
		Thread.sleep(3000);
		if (promptGrafikDaysSmaller.equals(pvPage.labelPromptSmallDays.getText()))
			System.out.println("SalesForecast One hundred eighth test is pass");
			else
				System.out.println("SalesForecast One hundred eighth test is false");
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

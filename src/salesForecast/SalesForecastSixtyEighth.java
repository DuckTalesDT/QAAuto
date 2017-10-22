package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastSixtyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//68-Увеличение/уменьшение графика в таблице "Графики"
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
		
		//Создаем ЦУ
		centersPage.addCenterThisMonth(driver);
				
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
		
		//Нажимаем увеличить
		pvPage.buttonGrafikBig.click();
			
		//Проверяем результата
		if (partGrafik.equals(pvPage.labelGrafikTitle.getText()))
			{
			//Cворачиваем окно
			pvPage.buttonGrafikSmall.click();
			
			//Проверяем результата
			if (partPv.equals(pvPage.labelTitle.getText()))
				System.out.println("SalesForecast Sixty-eighth test is pass");
				else
					System.out.println("SalesForecast Sixty-eighth test is false");
			}
			else
				System.out.println("SalesForecast Sixty-eighth test is false");
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

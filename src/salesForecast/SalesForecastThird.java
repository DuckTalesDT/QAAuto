package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//3-Создается центр учета за прошлый месяц без комментария
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
		
		//Создаем ЦУ за прошлый месяц
		pvPage.addCenterBeforeMonth(driver);
		
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
		
		//Проверяем результат
		if (countCenters_1 == (pvPage.countCenters(driver)))
			if (centerName.equals(pvPage.fieldCenterFirst.getText()))
				{
				//Открываем центр учета
				Thread.sleep(3000);
				pvPage.buttonCenterEdit.click();
				
				//Проверяем комментарий
				if (centerCommentEmpty.equals(centersPage.fieldCenterComment.getText()))
					System.out.println("SalesForecast Third test is pass");
					else
						System.out.println("SalesForecast Third test part №3 is false");
				}
				else
					System.out.println("SalesForecast Third test part №2 is false");
			else
				System.out.println("SalesForecast Third test part №1 is false");
			
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

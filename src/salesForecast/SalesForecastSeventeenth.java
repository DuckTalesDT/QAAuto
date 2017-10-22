package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastSeventeenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//17-Удаление комментария к центру учета
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
		
		//Нажимаем "Добавить центр учета"
		pvPage.buttonAddCenter.click();
					
		//Набираем название центра учета
		centersPage.fieldCenterName.sendKeys(centerName);
								
		//Убираем активность "За прошлый месяц"
		if (centersPage.buttonBeforePeriod.isEnabled())
			centersPage.buttonBeforePeriod.click();
				
		//Набираем комментарий
		centersPage.fieldCenterComment.sendKeys(centerComment);
						
		//Нажимаем "Сохранить"
		centersPage.buttonCenterSave.click();
		Thread.sleep(3000);		
		
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
						
		//Открываем ЦУ
		pvPage.buttonCenterEdit.click();
		
		//Удаляем комментарий
		centersPage.fieldCenterComment.sendKeys(empty_35);
								
		//Нажимаем "Сохранить"
		centersPage.buttonCenterSave.click();
		Thread.sleep(3000);
		
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
					System.out.println("SalesForecast Seventeenth test is pass");
					else
						System.out.println("SalesForecast Seventeenth test part №3 is false");
				}
				else
					System.out.println("SalesForecast Seventeenth test part №2 is false");
			else
				System.out.println("SalesForecast Seventeenth test part №1 is false");
			
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ если они есть
		centersPage.deleteAllCenter(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

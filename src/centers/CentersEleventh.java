package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersEleventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//11-Центр учета с существующим названием создается
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
												
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
			
		//Удаляем группы 
		centersPage.deleteAllGrup(driver);
		
		//Удаляем ЦУ 
		centersPage.deleteAllCenter(driver);
		
		//Добавляем 2 ЦУ за текущий месяц
		centersPage.addCenterThisMonth(driver);
		centersPage.addCenterThisMonth(driver);
		
		//Проверяем результат
		Thread.sleep(3000);
		if (countCenters_2 == (centersPage.countCenters(driver)))
			if (centerName.equals(centersPage.fieldCenterNameFirstTable.getText()))
				if (centerName.equals(centersPage.fieldCenterNameSecondTable.getText()))
					System.out.println("Centers Eleventh test is pass");
					else
						System.out.println("Centers Eleventh test part №2 is false");
				else
					System.out.println("Centers Eleventh test part №2 is false");
			else
				System.out.println("Centers Eleventh test part №1 is false");
		
		//Удаляем ЦУ 
		centersPage.deleteAllCenter(driver);
						
		//Закрываем сайт
		driver.quit();
	}

}

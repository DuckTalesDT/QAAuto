package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersFortieth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//40-Созданный за прошлый месяц центр учета имеет дату создания предыдущий месяц
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
		
		//Добавляем ЦУ за прошлый месяц
		centersPage.addCenterBeforeMonth(driver);
				
		//Проверяем результат
		Thread.sleep(3000);
		if (countCenters_1 == (centersPage.countCenters(driver)))
			if (centersBeforeMonth.equals(centersPage.labelCenterDateCreate.getText()))
				System.out.println("Centers Fortieth test is pass");
				else
					System.out.println("Centers Fortieth test part №2 is false");
			else
				System.out.println("Centers Fortieth test part №1 is false");
				
		//Удаляем ЦУ 
		centersPage.deleteAllCenter(driver);
						
		//Закрываем сайт
		driver.quit();
	}

}

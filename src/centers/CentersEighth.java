package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//8-Центр учета удаляется
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
		
		//Добавляем ЦУ за текущий месяц
		centersPage.addCenterThisMonth(driver);
		
		//Удаляем ЦУ 
		centersPage.deleteCenter(driver);
		
		//Проверяем результат
		Thread.sleep(3000);
		if (countCenters_0 == (centersPage.countCenters(driver)))
			System.out.println("Centers Eighth test is pass");
			else
				System.out.println("Centers Eighth test is false");
		
		//Удаляем ЦУ 
		centersPage.deleteAllCenter(driver);
						
		//Закрываем сайт
		driver.quit();
	}

}

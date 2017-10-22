package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersSixtyFifthPartTwo extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//65-Все созданные ЦУ/Группы сохраняются при каждом посещении приложения
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
												
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Проверяем результат
		if (countCenters_1 == (centersPage.countCenters(driver)))
			if (countGrups_1 == (centersPage.countGrups(driver)))
				System.out.println("Centers Sixty-fifth test is pass");
				else
					System.out.println("Centers Sixty-fifth test part №2 is false");
			else
				System.out.println("Centers Sixty-fifth test part №1 is false");
		
		//Удаляем Группы 
		centersPage.deleteAllGrup(driver);
		
		//Удаляем ЦУ 
		centersPage.deleteAllCenter(driver);
						
		//Закрываем сайт
		driver.quit();
		
		
	}

}

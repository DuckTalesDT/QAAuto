package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersTwentyNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//29-Группа с существующим названием создается
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
						
		//Добавляем 2 Группы
		centersPage.addGrup(driver);
		centersPage.addGrup(driver);
						
		//Проверяем результат
		if (countGrups_2 == (centersPage.countGrups(driver)))
			System.out.println("Centers Twenty-eighth test is pass");
			else
				System.out.println("Centers Twenty-eighth test is false");
		
		//Удаляем группы 
		centersPage.deleteAllGrup(driver);
		
		//Закрываем сайт
		driver.quit();
	}
}

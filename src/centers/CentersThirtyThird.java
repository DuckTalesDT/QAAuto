package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersThirtyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//33-Удаление Группы
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
						
		//Добавляем Группу
		centersPage.addGrup(driver);
		
		//Удаляем группы 
		centersPage.deleteAllGrup(driver);
				
		//Проверяем результат
		if (countGrups_0 == (centersPage.countGrups(driver)))
			System.out.println("Centers Thirty-third test is pass");
			else
				System.out.println("Centers Thirty-third test is false");
		
		//Удаляем группы 
		centersPage.deleteAllGrup(driver);
		
		//Закрываем сайт
		driver.quit();
	}
}

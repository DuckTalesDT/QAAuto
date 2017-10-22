package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersTwentyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//28-Отклонение в создании группы
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
						
		//Нажимаем "Добавить Группу"
		centersPage.buttonAddGrup.click();
						
		//Набираем название
		centersPage.fieldGrupName.sendKeys(grupName);			
				
		//Нажимаем "Отмена"
		centersPage.buttonGrupDontSave.click();	
		Thread.sleep(1000);
				
		//Проверяем результат
		if (countGrups_0 == (centersPage.countGrups(driver)))
			System.out.println("Centers Twenty-eighth test is pass");
			else
				System.out.println("Centers Twenty-eighth test is false");
		
		//Удаляем группы 
		centersPage.deleteAllGrup(driver);
		
		//Закрываем сайт
		driver.quit();
	}
}

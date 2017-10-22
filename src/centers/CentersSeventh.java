package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersSeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//7-Возврат в раздел "Центры учета" без содания
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
		
		//Нажимаем "Добавить центр учета"
		centersPage.buttonAddCenter.click();
				
		//Нажимаем "Отменить"
		centersPage.buttonCenterDontSave.click();
		
		//Проверяем результат
		Thread.sleep(3000);
		if (countCenters_0 == (centersPage.countCenters(driver)))
			System.out.println("Centers Seventh test is pass");
			else
				System.out.println("Centers Seventh test is false");
		
		//Удаляем ЦУ 
		centersPage.deleteAllCenter(driver);
						
		//Закрываем сайт
		driver.quit();
	}

}

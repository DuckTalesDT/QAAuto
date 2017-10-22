package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersFortyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//45-При удалении группы она не отображается в списке
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
		
		//Делаем активным "Показывать удаленные центры учета"
		centersPage.buttonPeriod.click();
		
		//Проверяем результат
		Thread.sleep(3000);
		if (countGrups_0 == (centersPage.countGrups(driver)))
			System.out.println("Centers Forty-fifth test is pass");
			else
				System.out.println("Centers Forty-fifth test is false");
		
		//Де-активируем "Показывать удаленные центры учета"
		centersPage.buttonPeriod.click();
								
		//Удаляем Группы 
		centersPage.deleteAllGrup(driver);
						
		//Закрываем сайт
		driver.quit();
	}

}

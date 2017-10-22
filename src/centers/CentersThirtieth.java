package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersThirtieth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//30-Невозможно создать группу без названия
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
						
		//Не набираем название
		//centersPage.fieldGrupName.sendKeys(grupName);			
				
		//Нажимаем "Сохранить"
		centersPage.buttonGrupSave.click();
		
		//Нажимаем "Отмена"
		centersPage.buttonGrupDontSave.click();
		Thread.sleep(1000);
				
		//Проверяем результат
		if (countGrups_0 == (centersPage.countGrups(driver)))
			System.out.println("Centers Twenty-sixth test is pass");
			else
				System.out.println("Centers Twenty-sixth test is false");
		
		//Удаляем группы 
		centersPage.deleteAllGrup(driver);
		
		//Закрываем сайт
		driver.quit();
	}
}

package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersThirtySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//36-Группа переименовывается
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
		
		//Открываем группу
		centersPage.buttonGrupOpen.click();
		
		//Набираем новое название
		centersPage.fieldNewGrupName.sendKeys(empty_15);	
		centersPage.fieldNewGrupName.sendKeys(grupNameNew);			
				
		//Нажимаем "Переименовать"
		centersPage.buttonGrupRename.click();
		Thread.sleep(3000);
				
		//Проверяем результат
		if (countGrups_1 == (centersPage.countGrups(driver)))
			if (grupNameNew.equals(centersPage.fieldGrupNameTable.getText()))
				System.out.println("Centers Twenty-sixth test is pass");
				else
					System.out.println("Centers Twenty-sixth test part №2 is false");
			else
				System.out.println("Centers Twenty-sixth test part №1 is false");
		
		//Удаляем группы 
		centersPage.deleteAllGrup(driver);
		
		//Закрываем сайт
		driver.quit();
	}
}

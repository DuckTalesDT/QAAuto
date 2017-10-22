package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersThirtySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//37-Удалить название группы не возможно
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
		
		//Удаляем название
		centersPage.fieldNewGrupName.sendKeys(empty_15);	
				
		//Нажимаем "Переименовать"
		centersPage.buttonGrupRename.click();
		
		//Нажимаем "Отмена"
		centersPage.buttonGrupDontRename.click();
		Thread.sleep(1000);
				
		//Проверяем результат
		if (countGrups_1 == (centersPage.countGrups(driver)))
			if (grupName.equals(centersPage.fieldGrupNameTable.getText()))
				System.out.println("Centers Twenty-seventh test is pass");
				else
					System.out.println("Centers Twenty-seventh test part №2 is false");
			else
				System.out.println("Centers Twenty-sixth test part №1 is false");
		
		//Удаляем группы 
		centersPage.deleteAllGrup(driver);
		
		//Закрываем сайт
		driver.quit();
	}
}

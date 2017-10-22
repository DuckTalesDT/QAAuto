package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersSixtyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//61-Название Группы принимает все разновидности символов
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
		centersPage.fieldGrupName.sendKeys(grupNameX);			
				
		//Нажимаем "Сохранить"
		centersPage.buttonGrupSave.click();
		Thread.sleep(3000);
		
		//Проверяем результат
		Thread.sleep(3000);
		if (countGrups_1 == (centersPage.countGrups(driver)))
			if (grupNameX.equals(centersPage.fieldGrupNameTable.getText()))
				System.out.println("Centers Sixty-first test is pass");
				else
					System.out.println("Centers Sixty-first test part №2 is false");
			else
				System.out.println("Centers Sixty-first test part №1 is false");
		
		//Удаляем Группы 
		centersPage.deleteAllGrup(driver);
						
		//Закрываем сайт
		driver.quit();
	}

}

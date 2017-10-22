package centers;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersTwentySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//27-Создается Группа при нажатии на "Enter"
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
				
		//Нажимаем "Enter"
		centersPage.fieldGrupName.sendKeys(Keys.ENTER);	
		Thread.sleep(3000);
				
		//Проверяем результат
		if (countGrups_1 == (centersPage.countGrups(driver)))
			if (grupName.equals(centersPage.fieldGrupNameTable.getText()))
				System.out.println("Centers Twenty-seventh test is pass");
				else
					System.out.println("Centers Twenty-seventh test part №2 is false");
			else
				System.out.println("Centers Twenty-seventh test part №1 is false");
		
		//Удаляем группы 
		centersPage.deleteAllGrup(driver);
		
		//Закрываем сайт
		driver.quit();
	}
}

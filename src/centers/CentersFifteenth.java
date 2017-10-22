package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersFifteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//15-Невозможно сохранить изменения по центру учета с удаленным названием
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
				
		//Добавляем ЦУ за текущий месяц
		centersPage.addCenterThisMonth(driver);
		
		//Выбираем данный центр учета
		centersPage.fieldCenterNameTable.click();
						
		//Набираем новое название центра учета
		centersPage.fieldCenterName.sendKeys(empty_15);
						
		//Нажимаем "Сохранить"
		centersPage.buttonCenterSave.click();
		
		//Нажимаем "Отменить"
		centersPage.buttonCenterDontSave.click();
		Thread.sleep(1000);
								
		//Проверяем результат
		if (countCenters_1 == (centersPage.countCenters(driver)))
			if (centerName.equals(centersPage.fieldCenterNameFirstTable.getText()))
				System.out.println("Centers Fifteenth test is pass");
				else
					System.out.println("Centers Fifteenth test part №2 is false");
			else
				System.out.println("Centers Fifteenth test part №1 is false");
		
		//Удаляем ЦУ 
		centersPage.deleteAllCenter(driver);
						
		//Закрываем сайт
		driver.quit();
	}

}

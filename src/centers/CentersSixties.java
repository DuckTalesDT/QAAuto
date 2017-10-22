package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersSixties extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//60-Название Центра учета принимает все разновидности символов
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
						
		//Набираем название центра учета
		centersPage.fieldCenterName.sendKeys(centerNameX);
						
		//Убираем активность "За прошлый месяц"
		if (centersPage.buttonBeforePeriod.isEnabled())
			centersPage.buttonBeforePeriod.click();
				
		//Нажимаем "Сохранить"
		centersPage.buttonCenterSave.click();
		Thread.sleep(3000);		
		
		//Проверяем результат
		Thread.sleep(3000);
		if (countCenters_1 == (centersPage.countCenters(driver)))
		if (centerNameX.equals(centersPage.fieldCenterNameFirstTable.getText()))
				System.out.println("Centers Sixties test is pass");
				else
					System.out.println("Centers Sixties test part №2 is false");
			else
				System.out.println("Centers Sixties test part №1 is false");
		
		//Удаляем ЦУ 
		centersPage.deleteAllCenter(driver);
						
		//Закрываем сайт
		driver.quit();
	}

}

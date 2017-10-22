package centers;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersSixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//6-Создается центр учета при нажатии на "Enter"
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
		centersPage.fieldCenterName.sendKeys(centerName);
								
		//Убираем активность "За прошлый месяц"
		if (centersPage.buttonBeforePeriod.isEnabled())
			centersPage.buttonBeforePeriod.click();
						
		///Нажимаем "Enter"
		centersPage.fieldCenterName.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
				
		//Проверяем результат
		if (countCenters_1 == (centersPage.countCenters(driver)))
			if (centerName.equals(centersPage.fieldCenterNameFirstTable.getText()))
				System.out.println("Centers Sixth test is pass");
				else
					System.out.println("Centers Sixth test part №2 is false");
			else
				System.out.println("Centers Sixth test part №1 is false");
		
		//Удаляем ЦУ 
		centersPage.deleteAllCenter(driver);
						
		//Закрываем сайт
		driver.quit();
	}

}

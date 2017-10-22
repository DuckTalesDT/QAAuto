package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersTwelfth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//12-Центр учета без заполнения графы "Название" не создается
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
						
		//Не набираем название центра учета
		//centersPage.fieldCenterName.sendKeys(centerName);
						
		//Убираем активность "За прошлый месяц"
		if (centersPage.buttonBeforePeriod.isEnabled())
			centersPage.buttonBeforePeriod.click();
				
		//Нажимаем "Сохранить"
		centersPage.buttonCenterSave.click();
				
		//Нажимаем "Отменить"
		centersPage.buttonCenterDontSave.click();
		
		//Проверяем результат
		Thread.sleep(3000);
		if (countCenters_0 == (centersPage.countCenters(driver)))
			System.out.println("Centers Twelfth test is pass");
			else
				System.out.println("Centers Twelfth test part is false");
					
		//Удаляем ЦУ 
		centersPage.deleteAllCenter(driver);
						
		//Закрываем сайт
		driver.quit();
	}

}

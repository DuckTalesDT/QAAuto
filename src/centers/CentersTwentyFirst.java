package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersTwentyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//21-Комментарий к центру учета принимает различные символы
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
		
		//Набираем комментарий
		centersPage.fieldCenterComment.sendKeys(centerCommentX);
				
		//Нажимаем "Сохранить"
		centersPage.buttonCenterSave.click();
		Thread.sleep(3000);		
											
		//Проверяем результат
		if (countCenters_1 == (centersPage.countCenters(driver)))
			{
			//Выбираем ЦУ
			centersPage.fieldCenterNameTable.click();
						
			//Проверяем
			if (centerCommentX.equals(centersPage.fieldCenterComment.getText()))
				System.out.println("Centers Twenty-first test is pass");
				else
					System.out.println("Centers Twenty-first test part №2 is false");
			}
			else
				System.out.println("Centers Twenty-first test part №1 is false");
						
		//Выходим из центра учета
		centersPage.buttonCenterOutdors.click();
		Thread.sleep(1000);
				
		//Удаляем ЦУ 
		centersPage.deleteAllCenter(driver);
							
		//Закрываем сайт
		driver.quit();
	}

}

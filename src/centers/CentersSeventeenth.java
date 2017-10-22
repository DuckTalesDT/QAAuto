package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersSeventeenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//17-Внесение комментария в созданный центр учета
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
								
		//Вводим комментарий
		centersPage.fieldCenterComment.sendKeys(centerComment);
								
		//Нажимаем "Сохранить"
		centersPage.buttonCenterSave.click();
		Thread.sleep(3000);
							
		//Проверяем результат
		if (countCenters_1 == (centersPage.countCenters(driver)))
			{
			//Выбираем ЦУ
			centersPage.fieldCenterNameTable.click();
								
			//Проверяем
			if (centerComment.equals(centersPage.fieldCenterComment.getText()))
				System.out.println("Centers Seventeenth test is pass");
				else
					System.out.println("Centers Seventeenth test part №2 is false");}
			else
				System.out.println("Centers Seventeenth test part №1 is false");
						
		//Выходим из центра учета
		centersPage.buttonCenterOutdors.click();
		Thread.sleep(1000);
		
		//Удаляем ЦУ 
		centersPage.deleteAllCenter(driver);
					
		//Закрываем сайт
		driver.quit();
	}

}

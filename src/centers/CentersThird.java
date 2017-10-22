package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//3-Создается центр учета за прошлый месяц без комментария
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
		
		//Добавляем ЦУ за прошлый месяц
		centersPage.addCenterBeforeMonth(driver);
		
		//Проверяем результат
		if (countCenters_1 == (centersPage.countCenters(driver)))
			{
			//Выбираем ЦУ
			centersPage.fieldCenterNameTable.click();
						
			//Проверяем
			if (centerCommentEmpty.equals(centersPage.fieldCenterComment.getText()))
				System.out.println("Centers Third test is pass");
				else
					System.out.println("Centers Third test part №2 is false");
			}
			else
				System.out.println("Centers Third test part №1 is false");
		
		//Выходим из центра учета
		centersPage.buttonCenterOutdors.click();
		Thread.sleep(1000);
					
		//Удаляем ЦУ 
		centersPage.deleteAllCenter(driver);
						
		//Закрываем сайт
		driver.quit();
	}

}

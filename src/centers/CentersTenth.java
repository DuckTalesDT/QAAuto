package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersTenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//10-Отказ при удаление центра учета
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
		
		//Нажимаем Удалить
		centersPage.buttonCenterDelete.click();
										
		//Отменяем удаление
		centersPage.buttonDontAgreeCenterDelete.click();
				
		//Проверяем результат
		if (countCenters_1 == (centersPage.countCenters(driver)))
			System.out.println("Centers Tenth test is pass");
			else
				System.out.println("Centers Tenth test is false");
		
		//Удаляем ЦУ 
		centersPage.deleteAllCenter(driver);
						
		//Закрываем сайт
		driver.quit();
	}

}

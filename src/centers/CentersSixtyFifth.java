package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersSixtyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//65-Все созданные ЦУ/Группы сохраняются при каждом посещении приложения
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
		
		//Добавляем группу за текущий месяц
		centersPage.addGrup(driver);
		
		//Закрываем сайт
		driver.close();
		
		
	}

}

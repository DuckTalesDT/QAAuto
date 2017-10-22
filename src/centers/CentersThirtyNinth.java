package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersThirtyNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//39-Созданный за текущий месяц центр учета имеет дату создания текущий месяц
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
		
		//Проверяем результат
		if (countCenters_1 == (centersPage.countCenters(driver)))
			if (centersThisMonth.equals(centersPage.labelCenterDateCreate.getText()))
				System.out.println("Centers Thirty-ninth test is pass");
				else
					System.out.println("Centers Thirty-ninth test part №2 is false");
			else
				System.out.println("Centers Thirty-ninth test part №1 is false");
				
		//Удаляем ЦУ 
		centersPage.deleteAllCenter(driver);
						
		//Закрываем сайт
		driver.quit();
	}

}

package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersFortyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//44-Дата создания группы не имеет значения
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
						
		//Добавляем Группу
		centersPage.addGrup(driver);
				
		//Проверяем результат
		if (grupsMonth.equals(centersPage.labelGrupDateCreate.getText()))
			System.out.println("Centers Forty-fourth test is pass");
			else
				System.out.println("Centers Forty-fourth test is false");
									
		//Удаляем Группы 
		centersPage.deleteAllGrup(driver);
						
		//Закрываем сайт
		driver.quit();
	}

}

package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersTwentyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//25-Наличие галочки "За прошлый период" при создании центра учета
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
												
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
				
		//Нажимаем "Добавить центр учета"
		centersPage.buttonAddCenter.click();
										
		//Проверяем результат
		if (centersPage.buttonBeforePeriod.isEnabled())
			System.out.println("Centers Twenty-fifth test is pass");
			else
				System.out.println("Centers Twenty-fifth test is false");
		
		//Закрываем сайт
		driver.quit();
	}

}

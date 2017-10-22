package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//1-Проверка общей цены тарифа "Персональный" в $
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrancePers(driver);
											
		//Открываем "Информация о тарифах"
		tarifPage.goOptionAboutTarif(driver);
		
		//Проверяем результат
		if (priceDolPerson.equals(tarifPage.labelPersPriceUsd.getText()))
			System.out.println("Rate First test is pass");
			else
				System.out.println("Rate First test is false");
		
		//Закрываем сайт
		driver.quit();
	}

}

package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//3-Проверка общей цены тарифа "Стандартный" полный пакет в $
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceStand(driver);
											
		//Открываем "Информация о тарифах"
		tarifPage.goOptionAboutTarif(driver);
		
		//Проверяем результат
		if (priceDolStand.equals(tarifPage.labelStandPriceUsd.getText()))
			System.out.println("Rate Third test is pass");
			else
				System.out.println("Rate Third test is false");
																		
		//Закрываем сайт
		driver.quit();
	}

}

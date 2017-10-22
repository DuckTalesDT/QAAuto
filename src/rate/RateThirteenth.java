package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateThirteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//13-Проверка общей цены тарифа "Оптимальный" с услугой "Управление денежными потоками" в $
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceOptimUdp(driver);
											
		//Открываем "Информация о тарифах"
		tarifPage.goOptionAboutTarif(driver);
		
		//Проверяем результат
		if (priceDolOptimUdp.equals(tarifPage.labelOptimPriceUsd.getText()))
			System.out.println("Rate Thirteenth test is pass");
			else
				System.out.println("Rate Thirteenth test is false");
														
		//Закрываем сайт
		driver.quit();
	}
}

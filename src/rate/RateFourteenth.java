package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateFourteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//14-Проверка общей цены тарифа "Оптимальный" с услугой "Управление денежными потоками" в UAH
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceOptimUdp(driver);
											
		//Открываем "Информация о тарифах"
		tarifPage.goOptionAboutTarif(driver);
		
		//Проверяем результат
		if (priceUahOptimUdp.equals(tarifPage.labelOptimPriceUah.getText()))
			System.out.println("Rate Fourteenth test is pass");
			else
				System.out.println("Rate Fourteenth test is false");
														
		//Закрываем сайт
		driver.quit();
	}
}

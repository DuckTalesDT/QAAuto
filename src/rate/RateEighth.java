package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//8-Проверка общей цены тарифа "Стандартный" с услугой "Управление денежными потоками" в UAH
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceStandUdp(driver);
											
		//Открываем "Информация о тарифах"
		tarifPage.goOptionAboutTarif(driver);
		
		//Проверяем результат
		if (priceUahStanUdp.equals(tarifPage.labelStandPriceUah.getText()))
			System.out.println("Rate Eighth test is pass");
			else
				System.out.println("Rate Eighth test is false");
		
		//Закрываем сайт
		driver.quit();
		
	}

}

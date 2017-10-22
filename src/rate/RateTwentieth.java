package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateTwentieth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//20-Проверка общей цены тарифа "Максимальный" с услугой "Управление денежными потоками" в UAH
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceMaximUdp(driver);
											
		//Открываем "Информация о тарифах"
		tarifPage.goOptionAboutTarif(driver);
		
		//Проверяем результат
		if (priceUahMaximUdp.equals(tarifPage.labelMaximPriceUah.getText()))
			System.out.println("Rate Twentieth test is pass");
			else
				System.out.println("Rate Twentieth test is false");
														
		//Закрываем сайт
		driver.quit();
	}

}

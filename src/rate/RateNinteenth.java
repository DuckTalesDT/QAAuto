package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateNinteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//19-Проверка общей цены тарифа "Максимальный" с услугой "Управление денежными потоками" в $
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceMaximUdp(driver);
											
		//Открываем "Информация о тарифах"
		tarifPage.goOptionAboutTarif(driver);
		
		//Проверяем результат
		if (priceDolMaximUdp.equals(tarifPage.labelMaximPriceUsd.getText()))
			System.out.println("Rate Ninteenth test is pass");
			else
				System.out.println("Rate Ninteenth test is false");
														
		//Закрываем сайт
		driver.quit();
	}

}

package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateEleventh extends Variables {
	@Test
	public void test() throws InterruptedException{
		//11-Проверка общей цены тарифа "Оптимальный" с услугой "Прогноз выручки" в $
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceOptimPv(driver);
											
		//Открываем "Информация о тарифах"
		tarifPage.goOptionAboutTarif(driver);
		
		//Проверяем результат
		if (priceDolOptimPv.equals(tarifPage.labelOptimPriceUsd.getText()))
			System.out.println("Rate Eleventh test is pass");
			else
				System.out.println("Rate Eleventh test is false");
		
		//Закрываем сайт
		driver.quit();
	}

}

package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//5-Проверка общей цены тарифа "Стандартный" с услугой "Прогноз выручки" в $
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceStandPv(driver);
											
		//Открываем "Информация о тарифах"
		tarifPage.goOptionAboutTarif(driver);
		
		//Проверяем результат
		if (priceDolStandPv.equals(tarifPage.labelStandPriceUsd.getText()))
			System.out.println("Rate Fifth test is pass");
			else
				System.out.println("Rate Fifth test is false");
														
		//Закрываем сайт
		driver.quit();
		
	}
}

package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateSeventeenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//17-Проверка общей цены тарифа "Максимальный" с услугой "Прогноз выручки" в $
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceMaximPv(driver);
											
		//Открываем "Информация о тарифах"
		tarifPage.goOptionAboutTarif(driver);
				
		//Проверяем результат
		if (priceDolMaximPv.equals(tarifPage.labelMaximPriceUsd.getText()))
			System.out.println("Rate Seventeenth test is pass");
			else
				System.out.println("Rate Seventeenth test is false");
																
		//Закрываем сайт
		driver.quit();
	
	}

}

package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//9-Проверка общей цены тарифа "Оптимальный" полный пакет в $
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceOptim(driver);
											
		//Открываем "Информация о тарифах"
		tarifPage.goOptionAboutTarif(driver);
		
		//Проверяем результат
		if (priceDolOptim.equals(tarifPage.labelOptimPriceUsd.getText()))
			System.out.println("Rate Ninth test is pass");
			else
				System.out.println("Rate Ninth test is false");
		
		//Закрываем сайт
		driver.quit();
	}

}

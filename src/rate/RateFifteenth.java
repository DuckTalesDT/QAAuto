package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateFifteenth extends Variables {
	@Test
	public void test() throws InterruptedException{
		//15-Проверка общей цены тарифа "Максимальный" полный пакет в $
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceMaxim(driver);
											
		//Открываем "Информация о тарифах"
		tarifPage.goOptionAboutTarif(driver);
		
		//Проверяем результат
		if (priceDolMaxim.equals(tarifPage.labelMaximPriceUsd.getText()))
			System.out.println("Rate Fifteenth test is pass");
			else
				System.out.println("Rate Fifteenth test is false");
														
		//Закрываем сайт
		driver.quit();
	}

}

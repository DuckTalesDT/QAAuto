package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateTwelfth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//12-Проверка общей цены тарифа "Оптимальный" с услугой "Прогноз выручки" в UAH
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceOptimPv(driver);
											
		//Открываем "Информация о тарифах"
		tarifPage.goOptionAboutTarif(driver);
		
		//Проверяем результат
		if (priceUahOptimPv.equals(tarifPage.labelOptimPriceUah.getText()))
			System.out.println("Rate Twelfth test is pass");
			else
				System.out.println("Rate Twelfth test is false");
		
		//Закрываем сайт
		driver.quit();
		
	}

}

package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateTenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//10-Проверка общей цены тарифа "Оптимальный" полный пакет в UAH
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceOptim(driver);
											
		//Открываем "Информация о тарифах"
		tarifPage.goOptionAboutTarif(driver);
		
		//Проверяем результат
		if (priceUahOptim.equals(tarifPage.labelOptimPriceUah.getText()))
			System.out.println("Rate Tenth test is pass");
			else
				System.out.println("Rate Tenth test is false");
		
		//Закрываем сайт
		driver.quit();
	}
}

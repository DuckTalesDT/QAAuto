package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateEighteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//18-Проверка общей цены тарифа "Максимальный" с услугой "Прогноз выручки" в UAH
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceMaximPv(driver);
											
		//Открываем "Информация о тарифах"
		tarifPage.goOptionAboutTarif(driver);
				
		//Проверяем результат
		if (priceUahMaximPv.equals(tarifPage.labelMaximPriceUah.getText()))
			System.out.println("Rate Eighteenth test is pass");
			else
				System.out.println("Rate Eighteenth test is false");
														
		//Закрываем сайт
		driver.quit();
	}
}

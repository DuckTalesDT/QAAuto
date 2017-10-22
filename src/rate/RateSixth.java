package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateSixth extends Variables {
	@Test
	public void test() throws InterruptedException{
		//6-Проверка общей цены тарифа "Стандартный" с услугой "Прогноз выручки" в UAH
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceStandPv(driver);
											
		//Открываем "Информация о тарифах"
		tarifPage.goOptionAboutTarif(driver);
		
		//Проверяем результат
		if (priceUahStandPv.equals(tarifPage.labelStandPriceUah.getText()))
			System.out.println("Rate Sixth test is pass");
			else
				System.out.println("Rate Sixth test is false");
														
		//Закрываем сайт
		driver.quit();
		
	}

}

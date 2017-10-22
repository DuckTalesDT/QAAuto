package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//4-Проверка общей цены тарифа "Стандартный" полный пакет в UAH
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceStand(driver);
											
		//Открываем "Информация о тарифах"
		tarifPage.goOptionAboutTarif(driver);
		
		//Проверяем результат
		if (priceUahStand.equals(tarifPage.labelStandPriceUah.getText()))
			System.out.println("Rate Fourth test is pass");
			else
				System.out.println("Rate Fourth test is false");
														
		//Закрываем сайт
		driver.quit();
	}

}

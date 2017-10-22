package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateSixteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//16-Проверка общей цены тарифа "Максимальный" полный пакет в UAH
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceMaxim(driver);
											
		//Открываем "Информация о тарифах"
		tarifPage.goOptionAboutTarif(driver);
		
		//Проверяем результат
		if (priceUahMaxim.equals(tarifPage.labelMaximPriceUah.getText()))
			System.out.println("Rate Sixteenth test is pass");
			else
				System.out.println("Rate Sixteenth test is false");
														
		//Закрываем сайт
		driver.quit();
	
	}

}

package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateSecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//2-Проверка общей цены тарифа "Персональный" в UAH
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrancePers(driver);
											
		//Открываем "Информация о тарифах"
		tarifPage.goOptionAboutTarif(driver);
		
		//Проверяем результат
		if (priceUahPerson.equals(tarifPage.labelPersPriceUah.getText()))
			System.out.println("Rate Second test is pass");
			else
				System.out.println("Rate Second test is false");
		
		//Закрываем сайт
		driver.quit();
		
	}

}

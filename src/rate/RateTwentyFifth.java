package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateTwentyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//25-Присутствует информации о помощи в оплате
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
											
		//Открываем "Информация о тарифах"
		tarifPage.goOptionAboutTarif(driver);
				
		//Проверяем результат
		if (infoConsultationRate.equals(tarifPage.labelMainPrompt.getText()))
			System.out.println("Rate Twenty-fifth test is pass");
			else
				System.out.println("Rate Twenty-fifth test is false");
								
		//Закрываем всплывающее окно
		driver.quit();
	}

}

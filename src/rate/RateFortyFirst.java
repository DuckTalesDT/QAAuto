package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFortyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//41-Соответствие цены продления тарифного плана "Персональный" на 90 дней
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrancePers(driver);
																		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Устанавливаем сроки оплаты 90 дней
		payPage.setDays_90(driver);
					
		//Проверяем результат
		if (pricePopPerson_90.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Forty-first test is pass");
			else
				System.out.println("Rate Forty-first test is false");
						
		//Закрываем сайт
		driver.quit();
	}

}

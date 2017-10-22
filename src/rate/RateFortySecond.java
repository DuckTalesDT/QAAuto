package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFortySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//42-Соответствие цены продления тарифного плана "Персональный" на 180 дней
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrancePers(driver);
																		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Устанавливаем сроки оплаты 180 дней
		payPage.setDays_180(driver);
					
		//Проверяем результат
		if (pricePopPerson_180.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Forty-second test is pass");
			else
				System.out.println("Rate Forty-second test is false");
						
		//Закрываем сайт
		driver.quit();
	}

}

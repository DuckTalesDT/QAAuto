package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFortyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//43-Соответствие цены продления тарифного плана "Персональный" на 360 дней
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrancePers(driver);
																		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Устанавливаем сроки оплаты 360 дней
		payPage.setDays_360(driver);
					
		//Проверяем результат
		if (pricePopPerson_360.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Forty-third test is pass");
			else
				System.out.println("Rate Forty-third test is false");
						
		//Закрываем сайт
		driver.quit();
	}

}

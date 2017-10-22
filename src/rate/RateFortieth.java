package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFortieth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//40-Соответствие цены продления тарифного плана "Персональный" на 60 дней
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrancePers(driver);
																		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Устанавливаем сроки оплаты 60 дней
		payPage.setDays_60(driver);
					
		//Проверяем результат
		if (pricePopPerson_60.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Fortieth test is pass");
			else
				System.out.println("Rate Fortieth test is false");
						
		//Закрываем сайт
		driver.quit();
					
	}
}



package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFortyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//45-Соответствие цены продления тарифного плана "Стандартный" полный пакет на 60 дней
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceStand(driver);
																		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Устанавливаем сроки оплаты 60 дней
		payPage.setDays_60(driver);
					
		//Проверяем результат
		if (pricePopStand_60.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Forty-fifth test is pass");
			else
				System.out.println("Rate Forty-fifth test is false");
						
		//Закрываем сайт
		driver.quit();
	}

}

package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFortySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//46-Соответствие цены продления тарифного плана "Стандартный" полный пакет на 90 дней
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceStand(driver);
																		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Устанавливаем сроки оплаты 90 дней
		payPage.setDays_90(driver);
					
		//Проверяем результат
		if (pricePopStand_90.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Forty-sixth test is pass");
			else
				System.out.println("Rate Forty-sixth test is false");
						
		//Закрываем сайт
		driver.quit();
	}

}

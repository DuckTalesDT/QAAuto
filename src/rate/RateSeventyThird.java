package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateSeventyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//73-Соответствие цены продления тарифного плана "Оптимальный" с услугой "Управление денежными потоками" на 360 дней
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceOptimUdp(driver);
																		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Устанавливаем сроки оплаты 360 дней
		payPage.setDays_360(driver);
					
		//Проверяем результат
		if (pricePopOptimUdp_360.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Seventy-third test is pass");
			else
				System.out.println("Rate Seventy-third test is false");
								
		//Закрываем сайт
		driver.quit();
	}

}

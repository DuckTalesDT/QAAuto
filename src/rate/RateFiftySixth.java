package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFiftySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//56-Соответствие цены продления тарифного плана "Стандартный" с услугой "Управление денежными потоками" на 90 дней
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceStandUdp(driver);
																		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Устанавливаем сроки оплаты 90 дней
		payPage.setDays_90(driver);
					
		//Проверяем результат
		if (pricePopStandUdp_90.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Fifty-sixth test is pass");
			else
				System.out.println("Rate Fifty-sixth test is false");
						
		//Закрываем сайт
		driver.quit();
	}

}

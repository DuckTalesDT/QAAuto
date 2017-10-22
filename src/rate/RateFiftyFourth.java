package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFiftyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//54-Соответствие цены продления тарифного плана "Стандартный" с услугой "Управление денежными потоками" на 30 дней
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceStandUdp(driver);
																		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Устанавливаем сроки оплаты 30 дней
		payPage.setDays_30(driver);
					
		//Проверяем результат
		if (pricePopStandUdp_30.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Fifty-fourth test is pass");
			else
				System.out.println("Rate Fifty-fourth test is false");
						
		//Закрываем сайт
		driver.quit();
	}

}

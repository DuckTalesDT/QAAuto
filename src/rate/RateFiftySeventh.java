package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFiftySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//57-Соответствие цены продления тарифного плана "Стандартный" с услугой "Управление денежными потоками" на 180 дней
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceStandUdp(driver);
																		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Устанавливаем сроки оплаты 180 дней
		payPage.setDays_180(driver);
					
		//Проверяем результат
		if (pricePopStandUdp_180.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Fifty-seventh test is pass");
			else
				System.out.println("Rate Fifty-seventh test is false");
						
		//Закрываем сайт
		driver.quit();
	}

}

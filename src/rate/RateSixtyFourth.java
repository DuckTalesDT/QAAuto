package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateSixtyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//64-Соответствие цены продления тарифного плана "Оптимальный" с услугой "Прогноз выручки" на 30 дней
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceOptimPv(driver);
																		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Устанавливаем сроки оплаты 30 дней
		payPage.setDays_30(driver);
					
		//Проверяем результат
		if (pricePopOptimPv_30.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Sixty-fourth test is pass");
			else
				System.out.println("Rate Sixty-fourth test is false");
						
		//Закрываем сайт
		driver.quit();
	}

}

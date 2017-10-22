package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateSixtySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//66-Соответствие цены продления тарифного плана "Оптимальный" с услугой "Прогноз выручки" на 90 дней
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceOptimPv(driver);
																		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Устанавливаем сроки оплаты 90 дней
		payPage.setDays_90(driver);
					
		//Проверяем результат
		if (pricePopOptimPv_90.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Sixty-sixth test is pass");
			else
				System.out.println("Rate Sixty-sixth test is false");
						
		//Закрываем сайт
		driver.quit();
	}

}

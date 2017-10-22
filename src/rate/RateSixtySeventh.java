package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateSixtySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//67-Соответствие цены продления тарифного плана "Оптимальный" с услугой "Прогноз выручки" на 180 дней
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceOptimPv(driver);
																		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Устанавливаем сроки оплаты 180 дней
		payPage.setDays_180(driver);
					
		//Проверяем результат
		if (pricePopOptimPv_180.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Sixty-seventh test is pass");
			else
				System.out.println("Rate Sixty-seventh test is false");
						
		//Закрываем сайт
		driver.quit();
	}

}

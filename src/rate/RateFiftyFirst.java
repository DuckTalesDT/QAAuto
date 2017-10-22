package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFiftyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//51-Соответствие цены продления тарифного плана "Стандартный" с услугой "Прогноз выручки" на 90 дней
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceStandPv(driver);
																		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Устанавливаем сроки оплаты 90 дней
		payPage.setDays_90(driver);
					
		//Проверяем результат
		if (pricePopStandPv_90.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Fifty-first test is pass");
			else
				System.out.println("Rate Fifty-first test is false");
						
		//Закрываем сайт
		driver.quit();
	}

}

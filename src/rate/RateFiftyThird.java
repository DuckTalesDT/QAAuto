package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFiftyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//53-Соответствие цены продления тарифного плана "Стандартный" с услугой "Прогноз выручки" на 360 дней
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceStandPv(driver);
																		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Устанавливаем сроки оплаты 360 дней
		payPage.setDays_360(driver);
					
		//Проверяем результат
		if (pricePopStandPv_360.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Fifty-third test is pass");
			else
				System.out.println("Rate Fifty-third test is false");
						
		//Закрываем сайт
		driver.quit();
	}

}

package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFiftySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//52-Соответствие цены продления тарифного плана "Стандартный" с услугой "Прогноз выручки" на 180 дней
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceStandPv(driver);
																		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Устанавливаем сроки оплаты 180 дней
		payPage.setDays_180(driver);
					
		//Проверяем результат
		if (pricePopStandPv_180.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Fifty-second test is pass");
			else
				System.out.println("Rate Fifty-second test is false");
						
		//Закрываем сайт
		driver.quit();
	}

}

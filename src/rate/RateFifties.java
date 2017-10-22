package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFifties extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//50-Соответствие цены продления тарифного плана "Стандартный" с услугой "Прогноз выручки" на 60 дней
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceStandPv(driver);
																		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Устанавливаем сроки оплаты 60 дней
		payPage.setDays_60(driver);
					
		//Проверяем результат
		if (pricePopStandPv_60.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Fifties test is pass");
			else
				System.out.println("Rate Fifties test is false");
						
		//Закрываем сайт
		driver.quit();
	}

}

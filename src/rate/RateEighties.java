package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateEighties extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//80-Соответствие цены продления тарифного плана "Максимальный" с услугой "Прогноз выручки" на 60 дней
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceMaximPv(driver);
																		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Устанавливаем сроки оплаты 60 дней
		payPage.setDays_60(driver);
					
		//Проверяем результат
		if (pricePopMaximPv_60.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Eighties test is pass");
			else
				System.out.println("Rate Eighties test is false");
								
		//Закрываем сайт
		driver.quit();
	}

}

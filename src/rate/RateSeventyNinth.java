package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateSeventyNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//79-Соответствие цены продления тарифного плана "Максимальный" с услугой "Прогноз выручки" на 30 дней
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceMaximPv(driver);
																		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Устанавливаем сроки оплаты 30 дней
		payPage.setDays_30(driver);
					
		//Проверяем результат
		if (pricePopMaximPv_30.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Seventy-ninth test is pass");
			else
				System.out.println("Rate Seventy-ninth test is false");
								
		//Закрываем сайт
		driver.quit();
	}

}

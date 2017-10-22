package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateSeventyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//75-Соответствие цены продления тарифного плана "Максимальный" полный пакет на 60 дней
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceMaxim(driver);
																		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Устанавливаем сроки оплаты 60 дней
		payPage.setDays_60(driver);
					
		//Проверяем результат
		if (pricePopMaxim_60.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Seventy-fifth test is pass");
			else
				System.out.println("Rate Seventy-fifth test is false");
								
		//Закрываем сайт
		driver.quit();
	}

}

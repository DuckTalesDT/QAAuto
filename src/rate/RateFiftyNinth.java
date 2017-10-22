package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFiftyNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//59-Соответствие цены продления тарифного плана "Оптимальный" полный пакет на 30 дней
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceOptim(driver);
																		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Устанавливаем сроки оплаты 30 дней
		payPage.setDays_30(driver);
					
		//Проверяем результат
		if (pricePopOptim_30.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Fifty-ninth test is pass");
			else
				System.out.println("Rate Fifty-ninth test is false");
						
		//Закрываем сайт
		driver.quit();
	}

}

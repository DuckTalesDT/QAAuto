package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateSixtieth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//60-Соответствие цены продления тарифного плана "Оптимальный" полный пакет на 60 дней
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceOptim(driver);
																		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Устанавливаем сроки оплаты 60 дней
		payPage.setDays_60(driver);
					
		//Проверяем результат
		if (pricePopOptim_60.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Sixtieth test is pass");
			else
				System.out.println("Rate Sixtieth test is false");
						
		//Закрываем сайт
		driver.quit();
	}

}

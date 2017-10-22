package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFortyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//48-Соответствие цены продления тарифного плана "Стандартный" полный пакет на 360 дней
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceStand(driver);
																		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Устанавливаем сроки оплаты 360 дней
		payPage.setDays_360(driver);
					
		//Проверяем результат
		if (pricePopStand_360.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Forty-eighth test is pass");
			else
				System.out.println("Rate Forty-eighth test is false");
						
		//Закрываем сайт
		driver.quit();
	}

}

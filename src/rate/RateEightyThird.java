package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateEightyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//83-Соответствие цены продления тарифного плана "Максимальный" с услугой "Прогноз выручки" на 360 дней
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceMaximPv(driver);
																		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Устанавливаем сроки оплаты 360 дней
		payPage.setDays_360(driver);
					
		//Проверяем результат
		if (pricePopMaximPv_360.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Eighty-third test is pass");
			else
				System.out.println("Rate Eighty-third test is false");
								
		//Закрываем сайт
		driver.quit();
	}

}

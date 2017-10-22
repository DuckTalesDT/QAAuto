package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateEightyNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//89-Соответствие предоставляемых услуг при тарифном плане "Персональный"
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrancePers(driver);
						
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
						
		//Проверяем результат
		if (lineTarifPerson  == (payPage.countUslugaBeforeChange(driver)))
			if (lineUserPers.equals(payPage.labelUslugaFirstBeforeChange.getText()))
				if (lineUdpYes.equals(payPage.labelUslugaSecondBeforeChange.getText()))
					System.out.println("Rate Eighty-ninth test is pass");
					else
						System.out.println("Rate Eighty-ninth test part №3 is false");
				else
					System.out.println("Rate Eighty-ninth test part №2 is false");
			else
				System.out.println("Rate Eighty-ninth test part №1 is false");
																													
		//Закрываем сайт
		driver.quit();
	}

}

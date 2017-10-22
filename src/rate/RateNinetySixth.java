package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateNinetySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//96-Соответствие предоставляемых услуг при при тарифном плане "Максимальный" полный пакет
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceMaxim(driver);
		
		//Удаляем пользователей и ЦУ
		tarifPage.deleteForChangeTarif(driver);
								
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
		
		//Проверяем результат
		if (lineTarifAll  == (payPage.countUslugaBeforeChange(driver)))
			if (lineUserMaxim.equals(payPage.labelUslugaFirstBeforeChange.getText()))
				if (lineCenterMaxim.equals(payPage.labelUslugaSecondBeforeChange.getText()))
					if (linePvYes.equals(payPage.labelUslugaThirdBeforeChange.getText()))
						if (lineUdpYes.equals(payPage.labelUslugaFourthBeforeChange.getText()))
							System.out.println("Rate Ninty-sixth test is pass");
							else
								System.out.println("Rate Ninty-sixth test part №5 is false");
						else
							System.out.println("Rate Ninty-sixth test part №4 is false");
					else
						System.out.println("Rate Ninty-sixth test part №3 is false");
				else
					System.out.println("Rate Ninty-sixth test part №2 is false");
			else
				System.out.println("Rate Ninty-sixth test part №1 is false");
		
		//Закрываем сайт
		driver.quit();
	}
}

package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateNinetyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//94-Соответствие предоставляемых услуг при при тарифном плане "Оптимальный"  с услугой "Прогноз выручки"
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceOptimPv(driver);
		
		//Удаляем пользователей и ЦУ
		tarifPage.deleteForChangeTarif(driver);
								
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
						
		//Проверяем результат
		if (lineTarifAll  == (payPage.countUslugaBeforeChange(driver)))
			if (lineUserOptim.equals(payPage.labelUslugaFirstBeforeChange.getText()))
				if (lineCenterOptim.equals(payPage.labelUslugaSecondBeforeChange.getText()))
					if (linePvYes.equals(payPage.labelUslugaThirdBeforeChange.getText()))
						if (lineUdpNo.equals(payPage.labelUslugaFourthBeforeChange.getText()))
							System.out.println("Rate Ninty-fourth test is pass");
							else
								System.out.println("Rate Ninty-fourth test part №5 is false");
						else
							System.out.println("Rate Ninty-fourth test part №4 is false");
					else
						System.out.println("Rate Ninty-fourth test part №3 is false");
				else
					System.out.println("Rate Ninty-fourth test part №2 is false");
			else
				System.out.println("Rate Ninty-fourth test part №1 is false");
		
		//Закрываем сайт
		driver.quit();
	}
}

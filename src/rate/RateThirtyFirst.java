package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateThirtyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//31-Соответствие предоставляемых услуг при изменении тарифного плана на "Cтандартный" с услугой "Прогноз выручки"
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceMaxim(driver);
		
		//Удаляем пользователей и ЦУ
		tarifPage.deleteForChangeTarif(driver);
				
		//Устанавливаем тариф Стандартный c ПВ
		tarifPage.changeTarifStandPv(driver);
						
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Проверяем результат
		if (lineTarifAll  == (payPage.countUslugaAfterChange(driver)))
			if (lineUserStand.equals(payPage.labelUslugaFirstAfterChange.getText()))
				if (lineCenterStand.equals(payPage.labelUslugaSecondAfterChange.getText()))
					if (linePvYes.equals(payPage.labelUslugaThirdAfterChange.getText()))
						if (lineUdpNo.equals(payPage.labelUslugaFourthAfterChange.getText()))
							System.out.println("Rate Thirty-first test is pass");
							else
								System.out.println("Rate Thirty-first test part №5 is false");
						else
							System.out.println("Rate Thirty-first test part №4 is false");
					else
						System.out.println("Rate Thirty-first test part №3 is false");
				else
					System.out.println("Rate Thirty-first test part №2 is false");
			else
				System.out.println("Rate Thirty-first test part №1 is false");
						
		//Возвращаем тариф на максимальный
		tarifPage.changeTarifMaxim(driver);
		
		//Закрываем сайт
		driver.quit();
	}

}

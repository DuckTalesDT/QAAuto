package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateThirtySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//36-Соответствие предоставляемых услуг при изменении тарифного плана на "Максимальный" полный пакет
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceOptim(driver);
		
		//Удаляем пользователей и ЦУ
		tarifPage.deleteForChangeTarif(driver);
				
		//Устанавливаем тариф Максимальный
		tarifPage.changeTarifMaxim(driver);
						
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
						
		//Проверяем результат
		if (lineTarifAll  == (payPage.countUslugaAfterChange(driver)))
			if (lineUserMaxim.equals(payPage.labelUslugaFirstAfterChange.getText()))
				if (lineCenterMaxim.equals(payPage.labelUslugaSecondAfterChange.getText()))
					if (linePvYes.equals(payPage.labelUslugaThirdAfterChange.getText()))
						if (lineUdpYes.equals(payPage.labelUslugaFourthAfterChange.getText()))
							System.out.println("Rate Thirty-sixth test is pass");
							else
								System.out.println("Rate Thirty-sixth test part №5 is false");
						else
							System.out.println("Rate Thirty-sixth test part №4 is false");
					else
						System.out.println("Rate Thirty-sixth test part №3 is false");
				else
					System.out.println("Rate Thirty-sixth test part №2 is false");
			else
				System.out.println("Rate Thirty-sixth test part №1 is false");
						
		//Возвращаем тариф на оптимальный
		tarifPage.changeTarifOptim(driver);
		
		//Закрываем сайт
		driver.quit();
	}

}

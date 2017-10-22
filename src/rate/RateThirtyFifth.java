package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateThirtyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//35-Соответствие предоставляемых услуг при изменении тарифного плана на "Оптимальный"  с услугой "Управление денежными потоками"
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceMaxim(driver);
		
		//Удаляем пользователей и ЦУ
		tarifPage.deleteForChangeTarif(driver);
				
		//Устанавливаем тариф оптимальный c УДП
		tarifPage.changeTarifOptimUdp(driver);
						
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Проверяем результат
		if (lineTarifAll  == (payPage.countUslugaAfterChange(driver)))
			if (lineUserOptim.equals(payPage.labelUslugaFirstAfterChange.getText()))
				if (lineCenterOptim.equals(payPage.labelUslugaSecondAfterChange.getText()))
					if (linePvNo.equals(payPage.labelUslugaThirdAfterChange.getText()))
						if (lineUdpYes.equals(payPage.labelUslugaFourthAfterChange.getText()))
							System.out.println("Rate Thirty-fifth test is pass");
							else
								System.out.println("Rate Thirty-fifth test part №5 is false");
						else
							System.out.println("Rate Thirty-fifth test part №4 is false");
					else
						System.out.println("Rate Thirty-fifth test part №3 is false");
				else
					System.out.println("Rate Thirty-fifth test part №2 is false");
			else
				System.out.println("Rate Thirty-fifth test part №1 is false");
						
		//Возвращаем тариф на максимальный
		tarifPage.changeTarifMaxim(driver);
		
		//Закрываем сайт
		driver.quit();
	}

}

package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateThirtyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//38-Соответствие предоставляемых услуг при изменении тарифного плана на "Максимальный" с услугой "Управление денежными потоками"
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceMaxim(driver);
		
		//Удаляем пользователей и ЦУ
		tarifPage.deleteForChangeTarif(driver);
				
		//Устанавливаем тариф Максимальный с УДП
		tarifPage.changeTarifMaximUdp(driver);
						
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
						
		//Проверяем результат
		if (lineTarifAll  == (payPage.countUslugaAfterChange(driver)))
			if (lineUserMaxim.equals(payPage.labelUslugaFirstAfterChange.getText()))
				if (lineCenterMaxim.equals(payPage.labelUslugaSecondAfterChange.getText()))
					if (linePvNo.equals(payPage.labelUslugaThirdAfterChange.getText()))
						if (lineUdpYes.equals(payPage.labelUslugaFourthAfterChange.getText()))
							System.out.println("Rate Thirty-eighth test is pass");
							else
								System.out.println("Rate Thirty-eighth test part №5 is false");
						else
							System.out.println("Rate Thirty-eighth test part №4 is false");
					else
						System.out.println("Rate Thirty-eighth test part №3 is false");
				else
					System.out.println("Rate Thirty-eighth test part №2 is false");
			else
				System.out.println("Rate Thirty-eighth test part №1 is false");
						
		//Возвращаем тариф на максимальный
		tarifPage.changeTarifMaxim(driver);
		
		//Закрываем сайт
		driver.quit();
	}

}

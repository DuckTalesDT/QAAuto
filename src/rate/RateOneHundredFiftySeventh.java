package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateOneHundredFiftySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//157-При подключении не активного разделов "Прогноз выручки" или "УДП" они начинают действовать сразу
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceMaximPv(driver);
		
		//Удаляем пользователей и ЦУ
		tarifPage.deleteForChangeTarif(driver);
		
		//Переходим на тариф Максимальный 
		tarifPage.changeTarifMaxim(driver);	
		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
		
		//Проверяем результат
		if (linePvYes.equals(payPage.labelUslugaThirdBeforeChange.getText()))
			if (lineUdpYes.equals(payPage.labelUslugaFourthBeforeChange.getText()))
				System.out.println("Rate One hundred fifty-seventh test is pass");
				else
					System.out.println("Rate One hundred fifty-seventh test part №2 is false");
			else
				System.out.println("Rate One hundred fifty-seventh test part №1 is false");
		
		//Меняем тариф на максимальный c ПВ
		tarifPage.changeTarifMaximPv(driver);	
																									
		//Закрываем сайт
		driver.quit();
	}
}

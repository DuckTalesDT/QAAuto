package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateOneHundredFourtyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//141-Изменение тарифного плана на "Стандартный" с услугой "Прогноз выручки"
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceMaxim(driver);
		
		//Удаляем пользователей и ЦУ
		tarifPage.deleteForChangeTarif(driver);
		
		//Переходим на тариф Стандартный с ПВ
		tarifPage.changeTarifStandPv(driver);	
		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
		
		//Проверяем результат
		if (textStand.equals(payPage.labelNameTarifAfterChange.getText()))
			if (linePvYes.equals(payPage.labelUslugaThirdAfterChange.getText()))
				if (lineUdpNo.equals(payPage.labelUslugaFourthAfterChange.getText()))
					System.out.println("Rate One hundred forty-first test is pass");
					else
						System.out.println("Rate One hundred forty-first test part №3 is false");
				else
					System.out.println("Rate One hundred forty-first test part №2 is false");
			else
				System.out.println("Rate One hundred forty-first test part №1 is false");
		
		//Меняем тариф на максимальный
		tarifPage.changeTarifMaxim(driver);	
																									
		//Закрываем сайт
		driver.quit();
		
	}

}

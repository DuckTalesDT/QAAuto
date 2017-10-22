package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateOneHundredFourtyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//145-Изменение тарифного плана на "Оптимальный" с услугой "Управление денежными потоками"
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceMaxim(driver);
		
		//Удаляем пользователей и ЦУ
		tarifPage.deleteForChangeTarif(driver);
		
		//Переходим на тариф Оптимальный c УДП
		tarifPage.changeTarifOptimUdp(driver);	
		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
		
		//Проверяем результат
		if (textOptim.equals(payPage.labelNameTarifAfterChange.getText()))
			if (linePvNo.equals(payPage.labelUslugaThirdAfterChange.getText()))
				if (lineUdpYes.equals(payPage.labelUslugaFourthAfterChange.getText()))
					System.out.println("Rate One hundred forty-fifth test is pass");
					else
						System.out.println("Rate One hundred forty-fifth test part №3 is false");
				else
					System.out.println("Rate One hundred forty-fifth test part №2 is false");
			else
				System.out.println("Rate One hundred forty-fifth test part №1 is false");
		
		//Меняем тариф на максимальный
		tarifPage.changeTarifMaxim(driver);	
																									
		//Закрываем сайт
		driver.quit();
		
	}

}

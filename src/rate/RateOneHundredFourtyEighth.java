package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateOneHundredFourtyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//148-Изменение тарифного плана на "Максимальный" с услугой "Управление денежными потоками"
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceMaxim(driver);
		
		//Удаляем пользователей и ЦУ
		tarifPage.deleteForChangeTarif(driver);
		
		//Переходим на тариф Максимальный c УДП
		tarifPage.changeTarifMaximUdp(driver);	
		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
		
		//Проверяем результат
		if (textMaxim.equals(payPage.labelNameTarifAfterChange.getText()))
			if (linePvNo.equals(payPage.labelUslugaThirdAfterChange.getText()))
				if (lineUdpYes.equals(payPage.labelUslugaFourthAfterChange.getText()))
					System.out.println("Rate One hundred forty-eighth test is pass");
					else
						System.out.println("Rate One hundred forty-eighth test part №3 is false");
				else
					System.out.println("Rate One hundred forty-eighth test part №2 is false");
			else
				System.out.println("Rate One hundred forty-eighth test part №1 is false");
		
		//Меняем тариф на максимальный
		tarifPage.changeTarifMaxim(driver);	
																									
		//Закрываем сайт
		driver.quit();
		
	}

}

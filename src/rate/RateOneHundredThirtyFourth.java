package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.UdpPage;
import forTests.Variables;

public class RateOneHundredThirtyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//134-"Прогноз выручки" не открывается при  тарифе "Максимальный" с услугой "Управление денежными потоками"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
		UdpPage udpPage = new UdpPage();
										
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceMaximUdp(driver);
				
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
		
		//Проверяем результат
		if (partUdp.equals(udpPage.labelTitle.getText()))
			System.out.println("Rate One hundred thirty-fourth test is pass");
			else
				System.out.println("Rate One hundred thirty-fourth test is false");
		
		//Закрываем сайт
		driver.quit();		
	}

}

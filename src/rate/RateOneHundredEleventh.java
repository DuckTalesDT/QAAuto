package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UdpPage;
import forTests.Variables;

public class RateOneHundredEleventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//111-"Управление денежными потоками" открывается при тарифе "Персональный"
		EntrancePage entrancePage = new EntrancePage();
		UdpPage udpPage = new UdpPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrancePers(driver);
				
		//Нажимаем "Управление денежными потоками"
		udpPage.optionUdp(driver);
		
		//Проверяем результат
		if (partUdp.equals(udpPage.labelTitle.getText()))
			System.out.println("Rate One hundred eleventh test is pass");
			else
				System.out.println("Rate One hundred eleventh test is false");
		
		//Закрываем сайт
		driver.quit();		
	}

}

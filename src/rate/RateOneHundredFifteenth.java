package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UdpPage;
import forTests.Variables;

public class RateOneHundredFifteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//115-"Управление денежными потоками"  открывается при  тарифе "Стандартный" с полным пакетом услуг
		EntrancePage entrancePage = new EntrancePage();
		UdpPage udpPage = new UdpPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceStand(driver);
				
		//Нажимаем "Управление денежными потоками"
		udpPage.optionUdp(driver);
		
		//Проверяем результат
		if (partUdp.equals(udpPage.labelTitle.getText()))
			System.out.println("Rate One hundred fifteenth test is pass");
			else
				System.out.println("Rate One hundred fifteenth test is false");
		
		//Закрываем сайт
		driver.quit();		
	}

}

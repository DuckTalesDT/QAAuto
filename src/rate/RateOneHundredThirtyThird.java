package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UdpPage;
import forTests.Variables;

public class RateOneHundredThirtyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//133-"Управление денежными потоками" открывается при  тарифе "Максимальный" с услугой "Управление денежными потоками"
		EntrancePage entrancePage = new EntrancePage();
		UdpPage udpPage = new UdpPage();
										
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceMaximUdp(driver);
				
		//Нажимаем "Управление денежными потоками"
		udpPage.optionUdp(driver);
		
		//Проверяем результат
		if (partUdp.equals(udpPage.labelTitle.getText()))
			System.out.println("Rate One hundred thirty-third test is pass");
			else
				System.out.println("Rate One hundred thirty-third test is false");
		
		//Закрываем сайт
		driver.quit();		
	}

}

package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UdpPage;
import forTests.Variables;

public class RateOneHundredSeventeenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//117-"Управление денежными потоками"  открывается при тарифе "Оптимальный" с полным пакетом услуг
		EntrancePage entrancePage = new EntrancePage();
		UdpPage udpPage = new UdpPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceOptim(driver);
				
		//Нажимаем "Управление денежными потоками"
		udpPage.optionUdp(driver);
		
		//Проверяем результат
		if (partUdp.equals(udpPage.labelTitle.getText()))
			System.out.println("Rate One hundred seventeenth test is pass");
			else
				System.out.println("Rate One hundred seventeenth test is false");
		
		//Закрываем сайт
		driver.quit();		
	}

}

package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.UdpPage;
import forTests.Variables;

public class RateOneHundredTwentyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//128-"Прогноз выручки" не открывается при  тарифе "Оптимальный" с услугой "Управление денежными потоками"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
		UdpPage udpPage = new UdpPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceOptimUdp(driver);
				
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
		
		//Проверяем результат
		if (partUdp.equals(udpPage.labelTitle.getText()))
			System.out.println("Rate One hundred twenty-eighth test is pass");
			else
				System.out.println("Rate One hundred twenty-eighth test is false");
		
		//Закрываем сайт
		driver.quit();		
	}

}

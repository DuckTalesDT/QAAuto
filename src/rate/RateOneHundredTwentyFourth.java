package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.UdpPage;
import forTests.Variables;

public class RateOneHundredTwentyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//124-"Управление денежными потоками" не открывается при тарифе "Стандартный" с услугой "Прогноз выручки"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
		UdpPage udpPage = new UdpPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceStandPv(driver);
				
		//Нажимаем "Управление денежными потоками"
		udpPage.optionUdp(driver);
		
		//Проверяем результат
		if (partPv.equals(pvPage.labelTitle.getText()))
			System.out.println("Rate One hundred twenty-fourth test is pass");
			else
				System.out.println("Rate One hundred twenty-fourth test is false");
		
		//Закрываем сайт
		driver.quit();		
	}

}

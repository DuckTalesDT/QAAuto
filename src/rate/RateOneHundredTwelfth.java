package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.UdpPage;
import forTests.Variables;

public class RateOneHundredTwelfth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//112-"Прогноз выручки" не открывается при тарифе "Персональный"
		EntrancePage entrancePage = new EntrancePage();
		UdpPage udpPage = new UdpPage();
		PvPage pvPage = new PvPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrancePers(driver);
				
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
		
		//Проверяем результат
		if (partUdp.equals(udpPage.labelTitle.getText()))
			System.out.println("Rate One hundred twelfth test is pass");
			else
				System.out.println("Rate One hundred twelfth test is false");
		
		//Закрываем сайт
		driver.quit();		
	}

}

package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UdpPage;
import forTests.Variables;

public class RateOneHundredTwentyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//125-Получена подсказка при открытии "Управление денежными потоками" при тарифе "Стандартный" с услугой "Прогноз выручки"
		EntrancePage entrancePage = new EntrancePage();
		UdpPage udpPage = new UdpPage();
				
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceStandPv(driver);
								
		//Получаем сообщение
		String toolTipText = udpPage.promptUdpDontOpen(driver);

		//Проверяем результат
		if (promptPartUdp.equals(toolTipText))
			System.out.println("Rate One hundred twenty-fifth test is pass");
			else
				System.out.println("Rate One hundred twenty-fifth test is false");
																
		//Закрываем сайт
		driver.quit();
		
	}
}

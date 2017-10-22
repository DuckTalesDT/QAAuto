package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UdpPage;
import forTests.Variables;

public class RateOneHundredThirtySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//137-Получена подсказка при открытии "Управление денежными потоками" при тарифе "Максимальный" с услугой "Прогноз выручки"
		EntrancePage entrancePage = new EntrancePage();
		UdpPage udpPage = new UdpPage();
				
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceMaximPv(driver);
								
		//Получаем сообщение
		String toolTipText = udpPage.promptUdpDontOpen(driver);

		//Проверяем результат
		if (promptPartUdp.equals(toolTipText))
			System.out.println("Rate One hundred thirty-seventh test is pass");
			else
				System.out.println("Rate One hundred thirty-seventh test is false");
																
		//Закрываем сайт
		driver.quit();
		
	}
}

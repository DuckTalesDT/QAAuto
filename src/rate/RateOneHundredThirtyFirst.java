package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UdpPage;
import forTests.Variables;

public class RateOneHundredThirtyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//131-Получена подсказка при открытии "Управление денежными потоками" при тарифе "Оптимальный" с услугой "Прогноз выручки"
		EntrancePage entrancePage = new EntrancePage();
		UdpPage udpPage = new UdpPage();
				
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceOptimPv(driver);
								
		//Получаем сообщение
		String toolTipText = udpPage.promptUdpDontOpen(driver);

		//Проверяем результат
		if (promptPartUdp.equals(toolTipText))
			System.out.println("Rate One hundred thirty-first test is pass");
			else
				System.out.println("Rate One hundred thirty-first test is false");
																
		//Закрываем сайт
		driver.quit();
		
	}
}

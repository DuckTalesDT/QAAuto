package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class RateOneHundredTwentyNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//129-Получена подсказка при открытии "Прогноз выручки" при тарифе "Оптимальный" с услугой "Управление денежными потоками"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
				
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceOptimUdp(driver);
								
		//Получаем сообщение
		String toolTipText = pvPage.promptPvDontOpen(driver);

		//Проверяем результат
		if (promptPartPv.equals(toolTipText))
			System.out.println("Rate One hundred twenty-ninth test is pass");
			else
				System.out.println("Rate One hundred twenty-ninth test is false");
																
		//Закрываем сайт
		driver.quit();
		
	}
}

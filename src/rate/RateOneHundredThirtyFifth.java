package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class RateOneHundredThirtyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//135-Получена подсказка при открытии "Прогноз выручки" при тарифе "Максимальный" с услугой "Управление денежными потоками"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
				
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceMaximUdp(driver);
								
		//Получаем сообщение
		String toolTipText = pvPage.promptPvDontOpen(driver);

		//Проверяем результат
		if (promptPartPv.equals(toolTipText))
			System.out.println("Rate One hundred thirty-fifth test is pass");
			else
				System.out.println("Rate One hundred thirty-fifth test is false");
																
		//Закрываем сайт
		driver.quit();
		
	}
}

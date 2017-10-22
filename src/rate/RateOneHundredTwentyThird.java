package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class RateOneHundredTwentyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//123-Получена подсказка при открытии "Прогноз выручки" при тарифе "Стандартный" с услугой "Управление денежными потоками"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
				
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceStandUdp(driver);
								
		//Получаем сообщение
		String toolTipText = pvPage.promptPvDontOpen(driver);

		//Проверяем результат
		if (promptPartPv.equals(toolTipText))
			System.out.println("Rate One hundred twenty-third test is pass");
			else
				System.out.println("Rate One hundred twenty-third test is false");
																
		//Закрываем сайт
		driver.quit();
		
	}
}

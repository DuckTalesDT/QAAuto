package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class RateOneHundredThirteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//113-Получена подсказка при открытии "Прогноз выручки" при тарифе "Персональный"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
				
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrancePers(driver);
					
		//Получаем сообщение
		String toolTipText = pvPage.promptPvDontOpen(driver);

		//Проверяем результат
		if (promptPartPv.equals(toolTipText))
			System.out.println("Rate One hundred thirteenth test is pass");
			else
				System.out.println("Rate One hundred thirteenth test is false");
																
		//Закрываем сайт
		driver.quit();
		
	}

}

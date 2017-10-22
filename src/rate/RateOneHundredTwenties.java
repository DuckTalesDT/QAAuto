package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class RateOneHundredTwenties extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//120-"Прогноз выручки" открывается при тарифе "Стандартный" с услугой "Прогноз выручки"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceStandPv(driver);
				
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
		
		//Проверяем результат
		if (partPv.equals(pvPage.labelTitle.getText()))
			System.out.println("Rate One hundred twenties test is pass");
			else
				System.out.println("Rate One hundred twenties test is false");
		
		//Закрываем сайт
		driver.quit();		
	}

}

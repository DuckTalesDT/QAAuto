package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class RateOneHundredFourteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//114-"Прогноз выручки" открывается при тарифе "Стандартный" с полным пакетом услуг
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceStand(driver);
				
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
		
		//Проверяем результат
		if (partPv.equals(pvPage.labelTitle.getText()))
			System.out.println("Rate One hundred forteenth test is pass");
			else
				System.out.println("Rate One hundred forteenth test is false");
		
		//Закрываем сайт
		driver.quit();		
	}

}

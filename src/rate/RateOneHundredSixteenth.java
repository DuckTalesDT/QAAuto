package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class RateOneHundredSixteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//116-"Прогноз выручки" открывается при тарифе "Оптимальный" с полным пакетом услуг
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceOptim(driver);
				
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
		
		//Проверяем результат
		if (partPv.equals(pvPage.labelTitle.getText()))
			System.out.println("Rate One hundred sixteenth test is pass");
			else
				System.out.println("Rate One hundred sixteenth test is false");
		
		//Закрываем сайт
		driver.quit();				
	}

}

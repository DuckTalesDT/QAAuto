package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class RateOneHundredTwentySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//126-"Прогноз выручки" открывается при тарифе "Оптимальный" с услугой "Прогноз выручки"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceOptimPv(driver);
				
		//Нажимаем "Прогноз выручки"
		pvPage.optionPv(driver);
		
		//Проверяем результат
		if (partPv.equals(pvPage.labelTitle.getText()))
			System.out.println("Rate One hundred twenty-sixth test is pass");
			else
				System.out.println("Rate One hundred twenty-sixth test is false");
		
		//Закрываем сайт
		driver.quit();		
	}

}

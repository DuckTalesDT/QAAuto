package rate;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateOneHundred extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//100-Переход на тариф "Стандартный" с учетом превышения условия по Max количеству центров учета не возможен
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
		CentersPage centersPage = new CentersPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceMaxim(driver);
		
		//Удаляем пользователей и ЦУ
		tarifPage.deleteForChangeTarif(driver);
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
		
		//Добавляем 6 ЦУ
		for(int i = 0 ; i < 6 ; i ++){
			centersPage.addCenterThisMonth(driver);
		}
		
		//Открываем "Информация о тарифах"
		tarifPage.goOptionAboutTarif(driver);
		
		//Переходим на тариф Стандартный
		tarifPage.changeTarifStand(driver);	
		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Проверяем результат
		if (driver.findElements(By.xpath(tarifBack)).size() == 0)
			System.out.println("Rate One hundred test is pass");
			else
				{
				System.out.println("Rate One hundred test is false");
			
				//Меняем тариф на максимальный
				tarifPage.changeTarifMaxim(driver);	
				}								
				
		//Удаляем пользователей и ЦУ
		tarifPage.deleteForChangeTarif(driver);
					
		//Закрываем сайт
		driver.quit();	
	}

}

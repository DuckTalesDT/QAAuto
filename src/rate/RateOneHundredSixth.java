package rate;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateOneHundredSixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//106-Получено сообщение при переходе на тариф "Стандартный" с учетом превышения условия по Max количеству центров учета
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		CentersPage centersPage = new CentersPage();
		PayPage payPage = new PayPage();
														
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
				
		//Выбираем тариф "Стандартный"
		tarifPage.buttonTarifStand.click();
									
		//Нажимаем "Изменить тарифный план"
		tarifPage.buttonChangeTarif.click();
									
		//Нажимаем "Согласен"
		tarifPage.buttonAgreeChangeTarif.click();
		Thread.sleep(1000);
												
		//Проверяем результат
		if (promptChangePakegeLimit.equals(tarifPage.promptChangeTarif.getText()))
			System.out.println("Rate One hundred sixth test is pass");
			else
				System.out.println("Rate One hundred sixth test is false");
		
		//Закрываем всплывающее сообщение
		tarifPage.buttonChangeTarifWindowClose.click();
		Thread.sleep(1000);
			
		//Возвращаем тариф на максимальный
		payPage.goOptionPay(driver);
		if (driver.findElements(By.xpath(tarifBack)).size() == 1)
			{	
			//Меняем тариф на максимальный
			tarifPage.changeTarifMaxim(driver);	
			}
		
		//Удаляем пользователей и ЦУ
		tarifPage.deleteForChangeTarif(driver);
							
		//Закрываем сайт
		driver.quit();	
	}

}

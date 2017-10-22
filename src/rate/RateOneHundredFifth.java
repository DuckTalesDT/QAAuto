package rate;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateOneHundredFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//105-Получено сообщение при переходе на тариф "Оптимальный" с учетом превышения условия по Max количеству центров учета
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
		
		//Добавляем 10 ЦУ
		for(int i = 0 ; i < 10 ; i ++){
			centersPage.addCenterThisMonth(driver);
		}
						
		//Открываем "Информация о тарифах"
		tarifPage.goOptionAboutTarif(driver);
				
		//Выбираем тариф "Оптимальный"
		tarifPage.buttonTarifOptim.click();
									
		//Нажимаем "Изменить тарифный план"
		tarifPage.buttonChangeTarif.click();
									
		//Нажимаем "Согласен"
		tarifPage.buttonAgreeChangeTarif.click();
		Thread.sleep(1000);
														
		//Проверяем результат
		if (promptChangePakegeLimit.equals(tarifPage.promptChangeTarif.getText()))
			System.out.println("Rate One hundred fifth test is pass");
			else
				System.out.println("Rate One hundred fifth test is false");
		
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

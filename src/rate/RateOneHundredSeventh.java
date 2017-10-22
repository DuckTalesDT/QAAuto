package rate;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.UsersPage;
import forTests.Variables;

public class RateOneHundredSeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//107-Получено сообщение при переходе на тариф "Персональный" с учетом превышения условия по Max количеству центров учета
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
		UsersPage usersPage = new UsersPage();
		CentersPage centersPage = new CentersPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
									
		//Открываем "Пользователи аккаунта"
		usersPage.goOptionUsers(driver);
																
		//Удаляем пользователей 
		usersPage.deleteAllUserSecond(driver);
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
						
		//Удаляем ЦУ 
		centersPage.deleteAllCenter(driver);
		
		//Добавляем 1 ЦУ
		centersPage.addCenterThisMonth(driver);
								
		//Открываем "Информация о тарифах"
		tarifPage.goOptionAboutTarif(driver);
				
		//Выбираем тариф "Персональный"
		tarifPage.buttonTarifPers.click();
									
		//Нажимаем "Изменить тарифный план"
		tarifPage.buttonChangeTarif.click();
									
		//Нажимаем "Согласен"
		tarifPage.buttonAgreeChangeTarif.click();
		Thread.sleep(1000);
												
		//Проверяем результат
		if (promptChangePakegeLimit.equals(tarifPage.promptChangeTarif.getText()))
			System.out.println("Rate One hundred seventh test is pass");
			else
				System.out.println("Rate One hundred seventh test is false");
		
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
		
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
							
		//Удаляем ЦУ 
		centersPage.deleteAllCenter(driver);
							
		//Закрываем сайт
		driver.quit();	
	}

}

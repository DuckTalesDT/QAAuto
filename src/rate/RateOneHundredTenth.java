package rate;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.UsersPage;
import forTests.Variables;

public class RateOneHundredTenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//110-Получено сообщение при переходе на тариф "Персональный" с учетом превышения условия по Max количеству пользователей
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		UsersPage usersPage = new UsersPage();
		CentersPage centersPage = new CentersPage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
								
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
				
		//Удаляем ЦУ 
		centersPage.deleteAllCenter(driver);
		
		//Открываем "Пользователи аккаунта"
		usersPage.goOptionUsers(driver);
																
		//Удаляем пользователей 
		usersPage.deleteAllUserSecond(driver);
		
		//Добавляем 1 пользователя
		usersPage.addUser(driver);
				
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
			System.out.println("Rate One hundred tenth test is pass");
			else
				System.out.println("Rate One hundred tenth test is false");
		
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
		
		//Открываем "Пользователи"
		usersPage.goOptionUsers(driver);
						
		//Удаляем 1 Пользователя
		usersPage.deleteSecondUser(driver);
						
		//Закрываем сайт
		driver.quit();	
	}
}

package rate;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.UsersPage;
import forTests.Variables;

public class RateOneHundredFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//104-Переход на тариф "Персональный" с учетом превышения условия по Max количеству пользователей не возможен
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
		UsersPage usersPage = new UsersPage();
		CentersPage centersPage = new CentersPage();
																
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
						
		//Переходим на тариф Персональный
		tarifPage.changeTarifPers(driver);	
		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Проверяем результат
		if (driver.findElements(By.xpath(tarifBack)).size() == 0)
			System.out.println("Rate One hundred fourth test is pass");
			else
				{
				System.out.println("Rate One hundred fourth test is false");
			
				//Меняем тариф на максимальный
				tarifPage.changeTarifMaxim(driver);	
				}								
				
		//Открываем "Пользователи"
		usersPage.goOptionUsers(driver);
						
		//Удаляем Пользователя
		usersPage.deleteSecondUser(driver);
						
		//Закрываем сайт
		driver.quit();	
	}

}

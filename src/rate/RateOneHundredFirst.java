package rate;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.UsersPage;
import forTests.Variables;

public class RateOneHundredFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//101-Переход на тариф "Персональный" с учетом превышения условия по Max количеству центров учета не возможен
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
		CentersPage centersPage = new CentersPage();
		UsersPage usersPage = new UsersPage();
														
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
		
		//Переходим на тариф Персональный
		tarifPage.changeTarifPers(driver);	
		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Проверяем результат
		if (driver.findElements(By.xpath(tarifBack)).size() == 0)
			System.out.println("Rate One hundred first test is pass");
			else
				{
				System.out.println("Rate One hundred first test is false");
			
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

package rate;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.UsersPage;
import forTests.Variables;

public class RateTwentySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//26-Изменение тарифного плана на "Персональный"
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
											
		//Открываем "Информация о тарифах"
		tarifPage.goOptionAboutTarif(driver);
		
		//Меняем тариф на Персональный
		tarifPage.changeTarifPers(driver);
				
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
		
		//Проверяем результат
		if (textPerson.equals(payPage.labelNameTarifAfterChange.getText()))
			System.out.println("Rate Twenty-sixth test is pass");
			else
				System.out.println("Rate Twenty-sixth test is false");
		
		//Возвращаем тариф на максимальный
		if (driver.findElements(By.xpath(tarifBack)).size() == 1)
			{	
			//Меняем тариф на максимальный
			tarifPage.changeTarifMaxim(driver);	
			}
																									
		//Закрываем сайт
		driver.quit();
		
		}

}

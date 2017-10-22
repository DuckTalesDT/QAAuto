package rate;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.UsersPage;
import forTests.Variables;

public class RateTwentyNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//29-Соответствие предоставляемых услуг при изменении тарифного плана на "Персональный"
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
													
		//Выбираем тарифный план Персональный
		tarifPage.changeTarifPers(driver);
				
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
								
		//Проверяем результат
		if (lineTarifPerson  == (payPage.countUslugaAfterChange(driver)))
			if (lineUserPers.equals(payPage.labelUslugaFirstAfterChange.getText()))
				if (lineUdpYes.equals(payPage.labelUslugaSecondAfterChange.getText()))
					System.out.println("Rate Twenty-ninth test is pass");
					else
						System.out.println("Rate Twenty-ninth test part №3 is false");
				else
					System.out.println("Rate Twenty-ninth test part №2 is false");
			else
				System.out.println("Rate Twenty-ninth test part №1 is false");
			
		//Возвращаем тариф на максимальный
		tarifPage.changeTarifMaxim(driver);
																											
		//Закрываем сайт
		driver.quit();
	}

}

package rate;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.UsersPage;
import forTests.Variables;

public class RateOneHundredThirtyNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//139-Новый тариф получает указатель "Ваш тариф" только завтро
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
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
				
		//Меняем тариф на Оптимальный
		tarifPage.changeTarifOptim(driver);
			
		//Проверяем результат
		Thread.sleep(3000);
		if (!tarifActive.equals(driver.findElement(By.xpath("//div[@data-id='2']/div/p")).getText()))
			if (tarifActive.equals(driver.findElement(By.xpath("//div[@data-id='3']/div/p")).getText()))
				System.out.println("Rate One hundred thirty-ninth test is pass");
				else
					System.out.println("Rate One hundred thirty-ninth test part №2 is false");
			else
				System.out.println("Rate One hundred thirty-ninth test part №1 is false");
		
	//Меняем тариф на максимальный
	tarifPage.changeTarifMaxim(driver);	
																									
	//Закрываем сайт
	driver.quit();
	
	}

}

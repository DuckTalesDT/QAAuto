package rate;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.UsersPage;
import forTests.Variables;

public class RateOneHundredSecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//102-Переход на тариф "Оптимальный" с учетом превышения условия по Max количеству пользователей не возможен
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
		UsersPage usersPage = new UsersPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceMaxim(driver);
		
		//Удаляем пользователей и ЦУ
		tarifPage.deleteForChangeTarif(driver);
		
		//Открываем "Пользователи"
		usersPage.goOptionUsers(driver);
		
		//Добавляем 18 пользователей
		for(int i = 0 ; i < 18 ; i++){
			usersPage.addUser(driver);
		}
		
		//Открываем "Информация о тарифах"
		tarifPage.goOptionAboutTarif(driver);
		
		//Переходим на тариф Оптимальный
		tarifPage.changeTarifOptim(driver);	
		
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
				
		//Проверяем результат
		if (driver.findElements(By.xpath(tarifBack)).size() == 0)
			System.out.println("Rate One hundred second test is pass");
			else
				{
				System.out.println("Rate One hundred second test is false");
			
				//Меняем тариф на максимальный
				tarifPage.changeTarifMaxim(driver);	
				}								
				
		//Открываем "Пользователи"
		usersPage.goOptionUsers(driver);
						
		//Удаляем 18 Пользователей
		for(int i = 0 ; i < 18 ; i ++){
			usersPage.deleteFourthUser(driver);
		}
				
		//Закрываем сайт
		driver.quit();	
	}

}

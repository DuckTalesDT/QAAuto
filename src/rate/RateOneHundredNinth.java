package rate;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.UsersPage;
import forTests.Variables;

public class RateOneHundredNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//109-Получено сообщение при переходе на тариф "Стандартный" с учетом превышения условия по Max количеству пользователей
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		UsersPage usersPage = new UsersPage();
		PayPage payPage = new PayPage();
																
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceMaxim(driver);
		
		//Удаляем пользователей и ЦУ
		tarifPage.deleteForChangeTarif(driver);
		
		//Открываем "Пользователи"
		usersPage.goOptionUsers(driver);
		
		//Добавляем 4 пользователей
		for(int i = 0 ; i < 4 ; i++){
			usersPage.addUser(driver);
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
			System.out.println("Rate One hundred ninth test is pass");
			else
				System.out.println("Rate One hundred ninth test is false");
		
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
						
		//Удаляем 4 Пользователей
		for(int i = 0 ; i < 4 ; i ++){
			usersPage.deleteFourthUser(driver);
		}
				
		//Закрываем сайт
		driver.quit();	
	}
}

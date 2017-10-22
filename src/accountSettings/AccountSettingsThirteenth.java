package accountSettings;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class AccountSettingsThirteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//13-Временная зона изменяется
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//Запускаем приложение и проходим авторизация
		entrancePage.entrance(driver);
				
		//Открываем раздел "Настройки аккаунта"
		accountPage.goOptionAccountSettinth(driver);
							
		//Выбираем новую временную зону
		accountPage.fieldTimeLisbon.click();
		accountPage.save(driver);
					
		//Меняем временную зону на Киев
		if (lisbon.equals(accountPage.fieldTime.getAttribute("value")))
			{
			//Меняем временную зону на Киев
			accountPage.fieldTimeKiev.click();
			accountPage.save(driver);
			
			//Проверяем результат:
			if (kiev.equals(accountPage.fieldTime.getAttribute("value")))
				System.out.println("AccountSettings Thirteenth test is pass");
				else
					System.out.println("AccountSettings Thirteenth test part №2 is false");
			}
			else
				System.out.println("AccountSettings Thirteenth test part №1 is false");
														
		//Закрываем сайт
		driver.quit();
	}

}

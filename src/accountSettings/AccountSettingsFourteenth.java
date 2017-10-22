package accountSettings;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class AccountSettingsFourteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//14-Базовая валюта UAH
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
							
		//Запускаем приложение и проходим авторизация
		entrancePage.entrance(driver);
				
		//Открываем раздел "Настройки аккаунта"
		accountPage.goOptionAccountSettinth(driver);
									
		//Проверяем результат:
		if (accountPage.fieldValutaUah.isSelected())
			System.out.println("AccountSettings Fourteenth test is pass");
			else
				System.out.println("AccountSettings Fourteenth test is false");
				
		//Закрываем сайт
		driver.quit();
	}
	
}

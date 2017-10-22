package accountSettings;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class AccountSettingsSecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//2-Названия организации в разделе "Настройки аккаунта" меняется после введения нового
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//Запускаем приложение и проходим авторизация
		entrancePage.entrance(driver);
				
		//Открываем раздел "Настройки аккаунта"
		accountPage.goOptionAccountSettinth(driver);
					
		//Печатаем новое название
		accountPage.fieldName.sendKeys(empty_35);
		accountPage.fieldName.sendKeys(homeNew);
		accountPage.save(driver);
		
		//Меняем название
		if (homeNew.equals(accountPage.fieldName.getAttribute("value")))
			{
			//Меняем название 
			accountPage.fieldName.sendKeys(empty_35);
			accountPage.fieldName.sendKeys(home);
			accountPage.save(driver);
			
			//Проверяем результат:
			if (home.equals(accountPage.fieldName.getAttribute("value")))
				System.out.println("AccountSettings Second test is pass");
				else
					System.out.println("AccountSettings Second test part №2 is false");
			}
			else
				System.out.println("AccountSettings Second test part №1 is false");
		
		//Закрываем сайт
		driver.quit();
	}

}

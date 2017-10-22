package accountSettings;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class AccountSettingsNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//9-Определить "Количество редактируемых дней" > 60 не возможно
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//Запускаем приложение и проходим авторизация
		entrancePage.entrance(driver);
				
		//Открываем раздел "Настройки аккаунта"
		accountPage.goOptionAccountSettinth(driver);
						
		//Устанавливаем значение графы "Количество редактируемых дней" > 60
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_61);
		accountPage.save(driver);
						
		//Обновляем страницу
		driver.navigate().refresh();
		Thread.sleep(3000);
						
		//Проверяем результат	
		if (date_60.equals(accountPage.fieldDays.getAttribute("value")))
			System.out.println("AccountSettings Ninth test is pass");
			else
				System.out.println("AccountSettings Ninth test is false");
		
		//Возвращаем "Количество редактируемых дней" = 60
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_60);
		accountPage.save(driver);
					
		//Закрываем сайт
		driver.quit();
	}

}

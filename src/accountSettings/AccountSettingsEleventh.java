package accountSettings;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class AccountSettingsEleventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 11-Изменение данных аккаунта без значения "Количество редактируемых дней" не возможно
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//Запускаем приложение и проходим авторизация
		entrancePage.entrance(driver);
				
		//Открываем раздел "Настройки аккаунта"
		accountPage.goOptionAccountSettinth(driver);
										
		//Очищаем поле "Количество редактируемых дней"
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_0);
		accountPage.save(driver);
								
		//Обновляем страницу
		driver.navigate().refresh();
		Thread.sleep(3000);
						
		//Проверяем результат:
		if (date_60.equals(accountPage.fieldDays.getAttribute("value")))
			System.out.println("AccountSettings Eleventh test is pass");
			else
				System.out.println("AccountSettings Eleventh test is false");
		
		//Возвращаем "Количество редактируемых дней" = 60
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_60);
		accountPage.save(driver);
			
		//Закрываем сайт
		driver.quit();
	}

}

package accountSettings;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class AccountSettingsEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//8-Получение подсказки при изменении аккаунта со значением "Количество редактируемых дней" = 0
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
								
		//Запускаем приложение и проходим авторизация
		entrancePage.entrance(driver);
				
		//Открываем раздел "Настройки аккаунта"
		accountPage.goOptionAccountSettinth(driver);
					
		//Устанавливаем значение "Количество редактируемых дней" = 0
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_0);
		accountPage.save(driver);
						
		//Проверяем результат: 
		if (promptCorrectDate_0.equals(accountPage.messagePrompt.getText()))
			System.out.println("AccountSettings Eighth test is pass");
			else
				System.out.println("AccountSettings Eighth test is false");
				
		//Возвращаем количество редактируемых дней
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_60);
		accountPage.save(driver);
										
		//Закрываем сайт
		driver.quit();
	}

}

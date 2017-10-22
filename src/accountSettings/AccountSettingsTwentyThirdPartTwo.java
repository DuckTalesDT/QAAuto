package accountSettings;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class AccountSettingsTwentyThirdPartTwo extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//23-Все последнии изменения сохраняются при каждом посещении приложения
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//Запускаем приложение и проходим авторизация
		entrancePage.entrance(driver);
				
		//Открываем раздел "Настройки аккаунта"
		accountPage.goOptionAccountSettinth(driver);
		
		//Проверяем результат:
		if (homeNew.equals(accountPage.fieldName.getAttribute("value")))
			if (accountPage.fieldRassilkaYes.isSelected())
				if (date_3.equals(accountPage.fieldDays.getAttribute("value")))
					if (lisbon.equals(accountPage.fieldTime.getAttribute("value")))
						System.out.println("AccountSettings Twenty-third test is pass");
						else
							System.out.println("AccountSettings  Twenty-third test part №4 is false");
					else
						System.out.println("AccountSettings  Twenty-third test part №3 is false");
				else
					System.out.println("AccountSettings  Twenty-third test part №2 is false");
			else
				System.out.println("AccountSettings  Twenty-third test part №1 is false");
		
		//Возвращаем все обратно
		accountPage.fieldName.sendKeys(empty_35);
		accountPage.fieldName.sendKeys(home);
		accountPage.fieldRassilkaNo.click();
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_60);
		accountPage.fieldTimeKiev.click();
		accountPage.save(driver);
				
		//Закрываем сайт
		driver.quit();
		
	}

}

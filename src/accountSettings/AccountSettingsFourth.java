package accountSettings;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class AccountSettingsFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 4-Название организации ограничено 30-ю символами
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//Запускаем приложение и проходим авторизация
		entrancePage.entrance(driver);
				
		//Открываем раздел "Настройки аккаунта"
		accountPage.goOptionAccountSettinth(driver);
								
		//Набираем название организации 31 символ
		accountPage.fieldName.sendKeys(empty_35);
		accountPage.fieldName.sendKeys(homeBigger);
			
		//Сохраняем изменения
		accountPage.save(driver);
					
		//Проверяем результат:	
		if (homeSmaller.equals(accountPage.fieldName.getText()))
			System.out.println("AccountSettings Fourth test is pass");
			else
				System.out.println("AccountSettings Fourth test is false");
		
		//Возвращаем название организации
		accountPage.fieldName.sendKeys(empty_35);
		accountPage.fieldName.sendKeys(home);
					
		//Сохраняем изменения
		accountPage.save(driver);
								
		//Закрываем сайт
		driver.quit();
	}

}

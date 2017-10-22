package editingAccount;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class EditingAccountEighteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 18-Названия организации в разделе "Настройки аккаунта" принимает все разновидности символов
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//Запускаем приложение и проходим авторизация
		entrancePage.entrance(driver);
				
		//Открываем раздел "Редактирование аккаунта"
		accountPage.optionEditingAccount(driver);       
						
		//Набираем название организации имеющее все разновидности символов
		accountPage.fieldName.sendKeys(empty_35);
		accountPage.fieldName.sendKeys(homeX);
		accountPage.save(driver);
				
		//Проверяем результат:
		if (homeX.equals(accountPage.fieldName.getAttribute("value")))
			System.out.println("EditingAccount Eighteenth test is pass");
			else
				System.out.println("EditingAccount Eighteenth test is false");
				
		//Возвращаем название организации
		accountPage.fieldName.sendKeys(empty_35);
		accountPage.fieldName.sendKeys(home);
		accountPage.save(driver);
				
		//Закрываем сайт
		driver.quit();
	}

}

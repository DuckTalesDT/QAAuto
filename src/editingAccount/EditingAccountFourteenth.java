package editingAccount;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class EditingAccountFourteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//14-Базовая валюта UAH
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
							
		//Запускаем приложение и проходим авторизация
		entrancePage.entrance(driver);
				
		//Открываем раздел "Редактирование аккаунта"
		accountPage.optionEditingAccount(driver);       
									
		//Проверяем результат:
		if (accountPage.fieldValutaUah.isSelected())
			System.out.println("EditingAccount Fourteenth test is pass");
			else
				System.out.println("EditingAccount Fourteenth test is false");
				
		//Закрываем сайт
		driver.quit();
	}
	
}

package editingAccount;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class EditingAccountTwentySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//22-Поменять базовую валюту не возможно
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//Запускаем приложение и проходим авторизация
		entrancePage.entrance(driver);
				
		//Открываем раздел "Редактирование аккаунта"
		accountPage.optionEditingAccount(driver);       
								
		//Проверяем результат:
		if (checkDisabled.equals(accountPage.fieldValuta.getAttribute("disabled")))
			System.out.println("EditingAccount Twenty-second test is pass");
			else
				System.out.println("EditingAccount Twenty-second test is false");
				
		//Закрываем сайт
		driver.quit();
	}
	
}

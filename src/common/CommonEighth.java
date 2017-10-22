package common;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CommonEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 8-Имеется раздел "Редактирование аккаунта"
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
																		
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
						
		//Открываем "Редактирование аккаунта"
		accountPage.optionEditingAccount(driver);
								
		//Проверяем результат
		if (partEditingAccount.equals(accountPage.labelEditingAccount.getText()))
			System.out.println("Common Eighth test is pass");
			else
				System.out.println("Common Eighth test is false");
						
		//Закрываем сайт
		driver.quit();
		
		
	}

}

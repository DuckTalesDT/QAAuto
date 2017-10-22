package editingAccount;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class EditingAccountThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//3-Название организации удаляется
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//Запускаем приложение и проходим авторизация
		entrancePage.entrance(driver);
				
		//Открываем раздел "Редактирование аккаунта"
		accountPage.optionEditingAccount(driver);       
								
		//Удаляем название организации
		accountPage.fieldName.sendKeys(empty_35);
		accountPage.save(driver);
				
		//Проверяем результат:	
		Thread.sleep(3000);
		if (homeEmpty.equals(accountPage.fieldName.getAttribute("value")))
			System.out.println("EditingAccount Third test is pass");
			else
				System.out.println("EditingAccount Third test is false");
		
		//Возвращаем название организации
		accountPage.fieldName.sendKeys(empty_35);
		accountPage.fieldName.sendKeys(home);
		accountPage.save(driver);
									
		//Закрываем сайт
		driver.quit();
	}

}

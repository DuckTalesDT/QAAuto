package editingAccount;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class EditingAccountTenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//10-Получение подсказки при изменении аккаунта со значением "Количество редактируемых дней" > 60
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//Запускаем приложение и проходим авторизация
		entrancePage.entrance(driver);
				
		//Открываем раздел "Редактирование аккаунта"
		accountPage.optionEditingAccount(driver);       
							
		//Устанавливаем значение "Количество редактируемых дней" > 60
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_61);
		accountPage.save(driver);
		
		//Проверяем результат: 
		if (promptCorrectDate_61.equals(accountPage.messagePrompt.getText()))
			System.out.println("EditingAccount Tenth test is pass");
			else
				System.out.println("EditingAccount Tenth test is false");
		
		//Возвращаем "Количество редактируемых дней" = 60
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_60);
		accountPage.save(driver);
										
		//Закрываем сайт
		driver.quit();
	}
}

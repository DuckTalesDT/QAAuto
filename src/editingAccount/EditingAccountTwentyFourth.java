package editingAccount;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class EditingAccountTwentyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//24- "Количество редактируемых дней" не принимает ничего кроме чисел 
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//Запускаем приложение и проходим авторизация
		entrancePage.entrance(driver);
				
		//Открываем раздел "Редактирование аккаунта"
		accountPage.optionEditingAccount(driver);       
						
		//Устанавливаем значение графы "Количество редактируемых дней" содержащий разные символы
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_xxx);
		accountPage.save(driver);
						
		//Обновляем страницу
		driver.navigate().refresh();
		Thread.sleep(3000);
						
		//Проверяем результат:
		if (date_60.equals(accountPage.fieldDays.getAttribute("value")))
			System.out.println("EditingAccount Twenty-fourth test is pass");
			else
				System.out.println("EditingAccount Twenty-fourth test is false");
		
		//Возвращаем "Количество редактируемых дней" = 60
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_60);
		accountPage.save(driver);
								
		//Закрываем сайт
		driver.quit();
	}

}

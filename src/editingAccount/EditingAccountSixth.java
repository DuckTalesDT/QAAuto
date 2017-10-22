package editingAccount;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class EditingAccountSixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//6-"Количество редактируемых дней" меняется
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//Запускаем приложение и проходим авторизация
		entrancePage.entrance(driver);
				
		//Открываем раздел "Редактирование аккаунта"
		accountPage.optionEditingAccount(driver);       
							
		//Печатаем новое количество редактируемых дней = 3
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_3);
		accountPage.save(driver);
							
		//Меняем количество редактируемых дней на 7
		if (date_3.equals(accountPage.fieldDays.getAttribute("value")))
			{
			//Возвращаем "Количество редактируемых дней" = 60
			accountPage.fieldDays.sendKeys(empty_2);
			accountPage.fieldDays.sendKeys(date_60);
			accountPage.save(driver);
							
			//Проверяем результат:
			Thread.sleep(3000);
			if (date_60.equals(accountPage.fieldDays.getAttribute("value")))
				System.out.println("EditingAccount Sixth test is pass");
				else
					System.out.println("EditingAccount Sixth test part №2 is false");
			}
			else
				System.out.println("EditingAccount Sixth test part №1 is false");
											
		//Закрываем сайт
		driver.quit();
	}
}

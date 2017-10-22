package editingAccount;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class EditingAccountFifteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//15-Сохранение изменений при нажатии "Enter"
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//Запускаем приложение и проходим авторизация
		entrancePage.entrance(driver);
				
		//Открываем раздел "Редактирование аккаунта"
		accountPage.optionEditingAccount(driver);       
					
		//Печатаем новое название
		accountPage.fieldName.sendKeys(empty_35);
		accountPage.fieldName.sendKeys(homeNew);
				
		//Печатаем новое количество редактируемых дней = 3
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_3);
				
		//Сохраняем изменения нажав на Enter
		accountPage.fieldName.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
							
		//Проверяем результат:
		if (homeNew.equals(accountPage.fieldName.getAttribute("value")))
			if (date_3.equals(accountPage.fieldDays.getAttribute("value")))
				System.out.println("EditingAccount Fifteenth test is pass");
				else
					System.out.println("EditingAccount Fifteenth test part №2 is false");
			else
				System.out.println("EditingAccount Fifteenth test part №1 is false");
			
		//Возвращаем название и дни редактирования
		accountPage.fieldName.sendKeys(empty_35);
		accountPage.fieldName.sendKeys(home);
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_60);
		accountPage.buttonSave.click();
		
		//Закрываем сайт
		driver.quit();
	}

}

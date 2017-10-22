package editingAccount;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class EditingAccountTwentyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//23-Все последнии изменения сохраняются при каждом посещении приложения
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//Запускаем приложение и проходим авторизация
		entrancePage.entrance(driver);
				
		//Открываем раздел "Редактирование аккаунта"
		accountPage.optionEditingAccount(driver);       
		
		//Печатаем новое название
		Thread.sleep(1000);
		accountPage.fieldName.sendKeys(empty_35);
		accountPage.fieldName.sendKeys(homeNew);
								
		//Устанавливаем "получать рассылку" = "Да"
		accountPage.fieldRassilkaYes.click();
		
		//Печатаем новое количество редактируемых дней = 3
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_3);
		accountPage.save(driver);
		
		//Выбираем новую временную зону
		accountPage.fieldTimeLisbon.click();
		
		//Сохраняем изменения
		accountPage.save(driver);
		
		//Закрываем сайт
		driver.quit();
	
	}

}

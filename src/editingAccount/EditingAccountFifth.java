package editingAccount;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class EditingAccountFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 5-Раздел "Получать рассылку" меняется
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//Запускаем приложение и проходим авторизация
		entrancePage.entrance(driver);
				
		//Открываем раздел "Редактирование аккаунта"
		accountPage.optionEditingAccount(driver);       
									
		//Устанавливаем "получать рассылку" = "Да"
		accountPage.fieldRassilkaYes.click();
		accountPage.save(driver);
						
		//Меняем "получать рассылку" на Нет
		if (accountPage.fieldRassilkaYes.isSelected())
			{
			//Меняем "получать рассылку" на Нет
			accountPage.fieldRassilkaNo.click();
								
			//Сохраняем изменения
			accountPage.save(driver);
					
			//Проверяем результат
			if (accountPage.fieldRassilkaNo.isSelected())
				System.out.println("EditingAccount Fifth test is pass");
				else
					System.out.println("EditingAccount Fifth test part №2 is false");
			}
			else
				System.out.println("EditingAccount Fifth test part №1 is false");
													
		//Закрываем сайт
		driver.quit();
	}

}

package editingAccount;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.MainPage;
import forTests.Variables;

public class EditingAccountFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//1-Названия на странице клиента и в разделе "Настройки аккаунта" одинаковы
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
		MainPage mainPage = new MainPage();
						
		//Запускаем приложение и проходим авторизация
		entrancePage.entrance(driver);
				
		//Открываем раздел "Редактирование аккаунта"
		accountPage.optionEditingAccount(driver);       
		
		//Печатаем название
		accountPage.fieldName.sendKeys(empty_35);
		accountPage.fieldName.sendKeys(home);
		accountPage.save(driver);
		
		//Получаем текст в разделе "Редактирование аккаунта"
		String homePart = accountPage.fieldName.getAttribute("value");
		
		//Получаем текст на странице клиента
		Thread.sleep(1000);
		String homePage = mainPage.labelAccount.getText();
		
		//Проверяем результат:
		if (homePart.equals(homePage))
			System.out.println("EditingAccount First test is pass");
			else
				System.out.println("EditingAccount First test is false");
		
		//Закрываем сайт
		driver.quit();
	}

}

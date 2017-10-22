package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileThirtyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//31-Данные пользователя меняются при нажатии на Enter
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
										
		//Открываем раздел "Редактирование профиля"
		profilePage.goOptionEditingProfile(driver);
		
		//Печатаем новый телефон
		profilePage.fieldName.sendKeys(Keys.END);
		profilePage.fieldName.sendKeys(empty_35);
		profilePage.fieldName.sendKeys(nameNew);
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
				
		//Сохраняем изменения нажав Enter
		profilePage.fieldName.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
				
		//Проверяем результат
		if (nameNew.equals(profilePage.fieldName.getAttribute("value")))
			System.out.println("EditingProfile Thirty-first test is pass");
			else
				System.out.println("EditingProfile Thirty-first test is false");
			
		//Возвращаем телефон
		profilePage.fieldName.sendKeys(Keys.END);
		profilePage.fieldName.sendKeys(empty_35);
		profilePage.fieldName.sendKeys(name);
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
		profilePage.save(driver);
				
		// Закрываем сайт
		driver.quit();
	}

}

package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileThirtySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//37-Имя удаляется
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
										
		//Открываем раздел "Редактирование профиля"
		profilePage.goOptionEditingProfile(driver);
		
		//Удаляем имя
		profilePage.fieldName.sendKeys(Keys.END);
		profilePage.fieldName.sendKeys(empty_35);
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
		profilePage.save(driver);
		
		//Возвращаем Имя
		if (nameEmpty.equals(profilePage.fieldName.getAttribute("value")))
			{
			//печатаем старое название
			profilePage.fieldName.sendKeys(Keys.END);
			profilePage.fieldName.sendKeys(empty_35);
			profilePage.fieldName.sendKeys(name);
			profilePage.fieldPassword.sendKeys(Keys.END);
			profilePage.fieldPassword.sendKeys(empty_15);
			profilePage.fieldPassword.sendKeys(parol);
			profilePage.save(driver);
				
			//Проверяем результат
			if (name.equals(profilePage.fieldName.getAttribute("value")))
				System.out.println("EditingProfile Thirty-seventh test is pass");
				else
					System.out.println("EditingProfile Thirty-seventh test part №2 is false");
			}
			else
				System.out.println("EditingProfile Thirty-seventh test part №1 is false");
		
		// Закрываем сайт
		driver.quit();
	}

}

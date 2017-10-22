package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileThirtieth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//30-Имя профиля ограничено 30-ю символами
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
										
		//Открываем раздел "Редактирование профиля"
		profilePage.goOptionEditingProfile(driver);
				
		//Печатаем имя >30 символов
		profilePage.fieldName.sendKeys(Keys.END);
		profilePage.fieldName.sendKeys(empty_35);
		profilePage.fieldName.sendKeys(nameBigger);
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
		profilePage.save(driver);
							
		//Проверяем результат
		if (nameSmaller.equals(profilePage.fieldName.getText()))
			System.out.println("EditingProfile Fifth test is pass");
			else
				System.out.println("EditingProfile Thirtieth test is false");
			
		//Возвращаем имя
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

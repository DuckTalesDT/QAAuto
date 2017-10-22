package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileFortyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//41-Всплывает подсказка при изменении пароля профиля при не заполнении графы "Новый пароль"
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
										
		//Открываем раздел "Редактирование профиля"
		profilePage.goOptionEditingProfile(driver);
				
		//Меняем пароль без введения нового пароля
		profilePage.buttonChangeParol.click();
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
		//profilePage.fieldNewPassword.sendKeys(Keys.END);
		//profilePage.fieldNewPassword.sendKeys(empty_11);
		//profilePage.fieldNewPassword.sendKeys(parolNew);
		profilePage.fieldRepeatPassword.sendKeys(Keys.END);
		profilePage.fieldRepeatPassword.sendKeys(empty_15);
		profilePage.fieldRepeatPassword.sendKeys(parolNew);
		profilePage.save(driver);
				
		//Проверяем результат
		if (promptIncorrectParolRepeat.equals(profilePage.labelPrompt.getText()))
			System.out.println("EditingProfile Forty-first test is pass");
			else 
				System.out.println("EditingProfile Forty-first test is false");
				
		//Возвращаем пароль
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parolNew);
		profilePage.fieldNewPassword.sendKeys(Keys.END);
		profilePage.fieldNewPassword.sendKeys(empty_15);
		profilePage.fieldNewPassword.sendKeys(parol);
		profilePage.fieldRepeatPassword.sendKeys(Keys.END);
		profilePage.fieldRepeatPassword.sendKeys(empty_15);
		profilePage.fieldRepeatPassword.sendKeys(parol);
		profilePage.save(driver);
				
		//Закрываем сайт
		driver.quit();
				
		}
}

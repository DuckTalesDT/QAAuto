package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileFortyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//43-Всплывает подсказка при изменении пароля профиля при не заполнении графы "Повторите пароль"
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
										
		//Открываем раздел "Редактирование профиля"
		profilePage.goOptionEditingProfile(driver);
				
		//Меняем пароль без заполнения графы "Повторите пароль"
		profilePage.buttonChangeParol.click();
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
		profilePage.fieldNewPassword.sendKeys(Keys.END);
		profilePage.fieldNewPassword.sendKeys(empty_15);
		profilePage.fieldNewPassword.sendKeys(parolNew);
		//profilePage.fieldRepeatPassword.sendKeys(Keys.END);
		//profilePage.fieldRepeatPassword.sendKeys(empty_11);
		//profilePage.fieldRepeatPassword.sendKeys(parol);
		profilePage.save(driver);
				
		//Проверяем результат
		Thread.sleep(1000);
		if (promptIncorrectParolRepeat.equals(profilePage.labelPrompt.getText()))
			System.out.println("EditingProfile Forty-third test is pass");
			else 
				System.out.println("EditingProfile Forty-third test is false");
				
		//Нажимаем "Изменить пароль"
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

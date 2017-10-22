package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileTwentieth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//20-Пароль профиля не меняется при неверном заполнении графы "Повторите пароль"
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
										
		//Открываем раздел "Редактирование профиля"
		profilePage.goOptionEditingProfile(driver);
				
		//Меняем пароль с не верным повторением
		profilePage.buttonChangeParol.click();
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
		profilePage.fieldNewPassword.sendKeys(Keys.END);
		profilePage.fieldNewPassword.sendKeys(empty_15);
		profilePage.fieldNewPassword.sendKeys(parolNew);
		profilePage.fieldRepeatPassword.sendKeys(Keys.END);
		profilePage.fieldRepeatPassword.sendKeys(empty_15);
		profilePage.fieldRepeatPassword.sendKeys(parolIncorrect);
		profilePage.save(driver);
				
		//Закрываем сайт
		driver.quit();
		
		
	}
}

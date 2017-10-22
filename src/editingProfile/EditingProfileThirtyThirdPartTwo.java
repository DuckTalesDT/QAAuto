package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.PvPage;
import forTests.Variables;

public class EditingProfileThirtyThirdPartTwo extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//33-Пароль профиля принимает все разновидности символов
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
		PvPage pvPage = new PvPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceXParol(driver);
								
		//Проверяем результат
		if (pageSistem.equals(pvPage.buttonPv.getText()))
			System.out.println("EditingProfile Thirty-third test is pass");
			else 
				System.out.println("EditingProfile Thirty-third test is false");
								
		//Открываем "Редактирование профиля"
		profilePage.goOptionEditingProfile(driver);
				
		//Возвращаем пароль
		profilePage.buttonChangeParol.click();
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parolX);
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

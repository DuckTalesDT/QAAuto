package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileFortiesPartTwo extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//40-Пароль профиля не меняется при не заполнении графы "Новый пароль"
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceNewParol(driver);
					
		//Проверяем результат
		if (pageEntrance.equals(entrancePage.LabelEntrance.getText()))
			System.out.println("EditingProfile Forties test is pass");
			else 
				{
				System.out.println("EditingProfile Forties test is false");
				
				//Открываем "Редактирование профиля"
				profilePage.goOptionEditingProfile(driver);
				
				//Возвращаем старый пароль
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
				}
				
		//Закрываем сайт
		driver.close();
	}
}

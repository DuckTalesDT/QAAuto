package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileSixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//6-Данные графы "E-mail" меняются
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
										
		//Открываем раздел "Редактирование профиля"
		profilePage.goOptionEditingProfile(driver);
		
		//Пишем новый "Email"
		profilePage.fieldEmail.sendKeys(Keys.END);
		profilePage.fieldEmail.sendKeys(empty_35);
		profilePage.fieldEmail.sendKeys(mailNew);
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
		profilePage.save(driver);
				
		//Закрываем сайт
		driver.quit();
				
		
	}

}

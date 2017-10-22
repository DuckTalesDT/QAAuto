package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileTwentyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//25-При нажатии "Показать" в графе "Новый пароль" пароль показан
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
										
		//Открываем раздел "Редактирование профиля"
		profilePage.goOptionEditingProfile(driver);
		
		//Набираем пароль в ячейке новый пароль
		profilePage.buttonChangeParol.click();
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
										
		//Нажимаем "Показать пароль"
		profilePage.buttonShowPassword.click();
				
		//Проверяем результат
		if (parolText.equals(profilePage.fieldPassword.getAttribute("type")))
			System.out.println("EditingProfile Twenty-fifth test is pass");
			else 
				System.out.println("EditingProfile Twenty-fifth test is false");
			
		//Закрываем сайт
		driver.quit();			
	}

}

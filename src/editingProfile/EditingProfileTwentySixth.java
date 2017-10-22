package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileTwentySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//26-При нажатии "Показать" в графе "Повторите пароль" пароль показан
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
										
		//Открываем раздел "Редактирование профиля"
		profilePage.goOptionEditingProfile(driver);
		
		//Набираем пароль в ячейке повторите пароль
		profilePage.buttonChangeParol.click();
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
												
		//Нажимаем "Показать пароль"
		profilePage.buttonShowPassword.click();
				
		//Проверяем результат
		if (parolText.equals(profilePage.fieldPassword.getAttribute("type")))
			System.out.println("EditingProfile Twenty-sixth test is pass");
			else 
				System.out.println("EditingProfile Twenty-sixth test is false");
			
		//Закрываем сайт
		driver.quit();				
	}

}

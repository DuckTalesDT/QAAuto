package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileTwentyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//24-При нажатии "Показать" в графе "Текущий пароль" пароль показан
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
										
		//Открываем раздел "Редактирование профиля"
		profilePage.goOptionEditingProfile(driver);
		
		//Набираем пароль в ячейке текущий пароль
		profilePage.buttonChangeParol.click();
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
								
		//Нажимаем "Показать пароль"
		profilePage.buttonShowPassword.click();
		
		//Проверяем результат
		if (parolText.equals(profilePage.fieldPassword.getAttribute("type")))
			System.out.println("EditingProfile Twenty-fourth test is pass");
			else 
				System.out.println("EditingProfile Twenty-fourth test is false");
			
		//Закрываем сайт
		driver.quit();			
	}

}

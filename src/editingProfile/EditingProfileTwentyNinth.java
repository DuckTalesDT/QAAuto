package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileTwentyNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//29-При нажатии "Скрыть" в графе "Повторите пароль" пароль скрыт
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
										
		//Открываем раздел "Редактирование профиля"
		profilePage.goOptionEditingProfile(driver);
		
		//Набираем пароль в ячейке повторите пароль
		profilePage.buttonChangeParol.click();
		profilePage.fieldRepeatPassword.sendKeys(Keys.END);
		profilePage.fieldRepeatPassword.sendKeys(empty_15);
		profilePage.fieldRepeatPassword.sendKeys(parol);
				
		//Нажимаем "Показать пароль"
		profilePage.buttonShowRepeatPassword.click();
				
		//Проверяем результат
		if (parolText.equals(profilePage.fieldRepeatPassword.getAttribute("type")))
			{
			//Нажимаем "Скрыть пароль"
			profilePage.buttonShowRepeatPassword.click();
			
			//Проверяем
			if (parolPassword.equals(profilePage.fieldRepeatPassword.getAttribute("type")))		
				System.out.println("EditingProfile Twenty-ninth test is pass");
				else 
					System.out.println("EditingProfile Twenty-ninth test part №2 is false");
			}
			else 
				System.out.println("EditingProfile Twenty-ninth test part №1 is false");
			
		//Закрываем сайт
		driver.quit();				
	}

}

package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileThirtySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//36-При обновлении страницы показанный пароль в графе "Повторить пароль" пароль скрыт
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
										
		//Открываем раздел "Редактирование профиля"
		profilePage.goOptionEditingProfile(driver);
		
		//Набираем пароль в ячейке повторить пароль
		profilePage.buttonChangeParol .click();
		profilePage.fieldRepeatPassword.sendKeys(Keys.END);
		profilePage.fieldRepeatPassword.sendKeys(empty_15);
		profilePage.fieldRepeatPassword.sendKeys(parol);
				
		//Нажимаем "Показать пароль"
		profilePage.buttonShowRepeatPassword .click();
		
		//Обновляем страницу
		driver.navigate().refresh();
		Thread.sleep(3000);
				
		//Проверяем результат
		if (parolPassword.equals(profilePage.fieldRepeatPassword.getAttribute("type")))
			System.out.println("EditingProfile Thirty-sixth test is pass");
			else 
				System.out.println("EditingProfile Thirty-sixth test is false");
			
		//Закрываем сайт
		driver.quit();			
	}

}

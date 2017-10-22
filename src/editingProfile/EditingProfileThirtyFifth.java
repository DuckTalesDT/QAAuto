package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileThirtyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//35-При обновлении страницы показанный пароль в графе "Новый пароль" пароль скрыт
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
										
		//Открываем раздел "Редактирование профиля"
		profilePage.goOptionEditingProfile(driver);
		
		//Набираем пароль в ячейке новый пароль
		profilePage.buttonChangeParol .click();
		profilePage.fieldNewPassword.sendKeys(Keys.END);
		profilePage.fieldNewPassword.sendKeys(empty_15);
		profilePage.fieldNewPassword.sendKeys(parol);
		
		//Нажимаем "Показать пароль"
		profilePage.buttonShowPassword .click();
		
		//Обновляем страницу
		driver.navigate().refresh();
		Thread.sleep(3000);
				
		//Проверяем результат
		if (parolPassword.equals(profilePage.fieldNewPassword.getAttribute("type")))
			System.out.println("EditingProfile Thirty-fifth test is pass");
			else 
				System.out.println("EditingProfile Thirty-fifth test is false");
			
		//Закрываем сайт
		driver.quit();			
	}

}

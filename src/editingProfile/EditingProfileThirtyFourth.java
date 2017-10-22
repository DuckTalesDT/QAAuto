package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileThirtyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//34-При обновлении страницы показанный пароль в графе "Текущий пароль" пароль скрыт
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
										
		//Открываем раздел "Редактирование профиля"
		profilePage.goOptionEditingProfile(driver);
						
		//Набираем пароль в ячейке пароль
		profilePage.buttonChangeParol .click();
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
		
		//Нажимаем "Показать пароль"
		profilePage.buttonShowPassword .click();
		
		//Обновляем страницу
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//Проверяем результат
		if (parolPassword.equals(profilePage.fieldPassword.getAttribute("type")))
			System.out.println("EditingProfile Thirty-fourth test is pass");
			else 
				System.out.println("EditingProfile Thirty-fourth test is false");
			
		//Закрываем сайт
		driver.quit();			
	}

}

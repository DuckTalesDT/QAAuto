package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileTwentyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//28-При нажатии "Скрыть" в графе "Новый пароль" пароль скрыт
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
										
		//Открываем раздел "Редактирование профиля"
		profilePage.goOptionEditingProfile(driver);
		
		//Набираем пароль в ячейке новый пароль
		profilePage.buttonChangeParol.click();
		profilePage.fieldNewPassword.sendKeys(Keys.END);
		profilePage.fieldNewPassword.sendKeys(empty_15);
		profilePage.fieldNewPassword.sendKeys(parol);
		
		//Нажимаем "Показать пароль"
		profilePage.buttonShowNewPassword.click();
				
		//Проверяем результат
		if (parolText.equals(profilePage.fieldNewPassword.getAttribute("type")))
			{
			//Нажимаем "Скрыть пароль"
			profilePage.buttonShowNewPassword.click();
						
			//Проверяем
			if (parolPassword.equals(profilePage.fieldNewPassword.getAttribute("type")))		
				System.out.println("EditingProfile Twenty-eighth test is pass");
				else 
					System.out.println("EditingProfile Twenty-eighth test part №2 is false");
			}
			else 
				System.out.println("EditingProfile Twenty-eighth testn part №1 is false");
			
		//Закрываем сайт
		driver.quit();		
	}

}

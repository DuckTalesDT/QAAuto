package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileTwentySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//27-При нажатии "Скрыть" в графе "Текущий пароль" пароль скрыт
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
			{
			//Нажимаем "Скрыть пароль"
			profilePage.buttonShowPassword.click();
			
			//Проверяем
			if (parolPassword.equals(profilePage.fieldPassword.getAttribute("type")))		
				System.out.println("EditingProfile Twenty-seventh test is pass");
				else 
					System.out.println("EditingProfile Twenty-seventh test part №2 is false");
			}
			else 
				System.out.println("EditingProfile Twenty-seventh test part №1 is false");
			
		//Закрываем сайт
		driver.quit();				
	}

}

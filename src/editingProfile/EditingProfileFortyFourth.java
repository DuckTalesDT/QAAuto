package editingProfile;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileFortyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//44-Ячейки с паролями пустые до заполнения
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
										
		//Открываем раздел "Редактирование профиля"
		profilePage.goOptionEditingProfile(driver);
				
		//Нажимаем "Изменить пароль"
		profilePage.buttonChangeParol.click();
		
		//Проверяем результат
		Thread.sleep(1000);
		if (parolEmpty.equals(profilePage.fieldPassword .getText()))
			if (parolEmpty.equals(profilePage.fieldPassword .getText()))
				if (parolEmpty.equals(profilePage.fieldPassword .getText()))
					System.out.println("EditingProfile Forty-fourth test is pass");
					else 
						System.out.println("EditingProfile Forty-fourth part №3 test is false");
				else 
					System.out.println("EditingProfile Forty-fourth part №2 test is false");
			else 
				System.out.println("EditingProfile Forty-fourth part №1 test is false");
		
		//Закрываем сайт
		driver.quit();
				
		}
}

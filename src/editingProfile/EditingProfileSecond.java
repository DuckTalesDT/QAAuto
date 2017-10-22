package editingProfile;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileSecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//2-Имя при создании аккаунта и в данных профиля соответствуют
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
										
		//Открываем раздел "Редактирование профиля"
		profilePage.goOptionEditingProfile(driver);
		
		//Проверяем результат
		if (name.equals(profilePage.fieldName.getAttribute("value")))
			System.out.println("EditingProfile Second test is pass");
			else
				System.out.println("EditingProfile Second test is false");
				
		// Закрываем сайт
		driver.quit();
	}

}

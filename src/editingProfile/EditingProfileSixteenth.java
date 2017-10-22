package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileSixteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//16-Изменить данные аккаунта без значения графы "E-mail" не возможно
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
										
		//Открываем раздел "Редактирование профиля"
		profilePage.goOptionEditingProfile(driver);
				
		//Удаляем данные в графe "Email"
		profilePage.fieldEmail.sendKeys(Keys.END);
		profilePage.fieldEmail.sendKeys(empty_35);
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
		profilePage.save(driver);
				
		//Обновляем страницу
		driver.navigate().refresh();
						
		//Проверяем результат
		if (mail.equals(profilePage.fieldEmail.getAttribute("value")))
			System.out.println("EditingProfile Sixteenth test is pass");
			else
				System.out.println("EditingProfile Sixteenth test is false");
		
		//Возвращаем "Email"
		profilePage.fieldEmail.sendKeys(Keys.END);
		profilePage.fieldEmail.sendKeys(empty_35);
		profilePage.fieldEmail.sendKeys(mail);
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
		profilePage.save(driver);
			
		//Закрываем сайт
		driver.quit();
	}

}

package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileNinteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//19-Получение подсказки при изменении данных профиля при неверном заполнении графы "Текущий пароль"
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
										
		//Открываем раздел "Редактирование профиля"
		profilePage.goOptionEditingProfile(driver);
										
		//Изменяем данные в графe "Email" и не верный "Текущий пароль"
		profilePage.fieldEmail.sendKeys(Keys.END);
		profilePage.fieldEmail.sendKeys(empty_35);
		profilePage.fieldEmail.sendKeys(mailNew);
									
		//Набираем старый пароль неправильно
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parolIncorrect);
		profilePage.save(driver);
						
		//Проверяем результат
		if (promptIncorrectParol.equals(profilePage.labelPrompt.getText()))
			System.out.println("EditingProfile Ninteenth test is pass");
			else
				System.out.println("EditingProfile Ninteenth test is false");
		
		//Возвращаем E-mail
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

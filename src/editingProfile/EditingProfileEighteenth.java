package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileEighteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//18-Изменение данных профиля не принимается при неверном заполнении графы "Текущий пароль"
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
										
		//Открываем раздел "Редактирование профиля"
		profilePage.goOptionEditingProfile(driver);
															
		//Изменяем данные в графe "Email" набрав не верный пароль
		profilePage.fieldEmail.sendKeys(Keys.END);
		profilePage.fieldEmail.sendKeys(empty_35);
		profilePage.fieldEmail.sendKeys(mailNew);
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parolIncorrect);
		profilePage.save(driver);
				
		//Обновляем страницу
		driver.navigate().refresh();
		Thread.sleep(3000);
						
		//Проверяем результат
		if (mail.equals(profilePage.fieldEmail.getAttribute("value")))
			System.out.println("EditingProfile Eighteenth test is pass");
			else
				System.out.println("EditingProfile Eighteenth test is false");
		
		//Возвращаем "Email"
		profilePage.fieldEmail.sendKeys(Keys.END);
		profilePage.fieldEmail.sendKeys(empty_35);
		profilePage.fieldEmail.sendKeys(mail);
		profilePage.fieldEmail.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
		profilePage.save(driver);
					
		//Закрываем сайт
		driver.quit();
	}

}

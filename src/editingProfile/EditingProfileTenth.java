package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileTenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//10-Изменить номер телефона на имеющий более 10 символов не возможно
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
										
		//Открываем раздел "Редактирование профиля"
		profilePage.goOptionEditingProfile(driver);
				
		//Набираем данные в графe "Телефон" >10 знаков
		profilePage.fieldTelephone.sendKeys(Keys.END);
		profilePage.fieldTelephone.sendKeys(empty_15);
		profilePage.fieldTelephone.sendKeys(telephoneBigger);
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
		profilePage.save(driver);
				
		//Обновляем страницу
		driver.navigate().refresh();
		Thread.sleep(3000);
				
		//Проверяем результат
		if (telephone.equals(profilePage.fieldTelephone.getAttribute("value")))
			System.out.println("EditingProfile Tenth test is pass");
			else
				System.out.println("EditingProfile Tenth test is false");
		
		//Возвращаем "Телефон"
		profilePage.fieldTelephone.sendKeys(Keys.END);
		profilePage.fieldTelephone.sendKeys(empty_15);
		profilePage.fieldTelephone.sendKeys(telephoneBigger);
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
		profilePage.save(driver);
			
		//Закрываем сайт
		driver.quit();
	}

}

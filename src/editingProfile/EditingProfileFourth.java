package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//4-Данные графы "Телефон" меняются
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
										
		//Открываем раздел "Редактирование профиля"
		profilePage.goOptionEditingProfile(driver);
		
		//Печатаем новый телефон
		profilePage.fieldTelephone.sendKeys(Keys.END);
		profilePage.fieldTelephone.sendKeys(empty_15);
		profilePage.fieldTelephone.sendKeys(telephoneNew);
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
		profilePage.save(driver);
		
		//Возвращаем телефон
		if (telephoneNew.equals(profilePage.fieldTelephone.getAttribute("value")))
			{
			//Возвращаем телефон
			profilePage.fieldTelephone.sendKeys(Keys.END);
			profilePage.fieldTelephone.sendKeys(empty_15);
			profilePage.fieldTelephone.sendKeys(telephone);
			profilePage.fieldPassword.sendKeys(Keys.END);
			profilePage.fieldPassword.sendKeys(empty_15);
			profilePage.fieldPassword.sendKeys(parol);
			profilePage.save(driver);
			
			//Проверяем результат
			if (telephone.equals(profilePage.fieldTelephone.getAttribute("value")))
				System.out.println("EditingProfile Fourth test is pass");
				else
					System.out.println("EditingProfile Fourth test part №2 is false");
			}
			else
				System.out.println("EditingProfile Fourth test part №1 is false");
				
		// Закрываем сайт
		driver.quit();
	}

}

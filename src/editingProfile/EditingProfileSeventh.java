package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileSeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//7-Данные графы "СМС-авторизация" меняются на "Да"
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
										
		//Открываем раздел "Редактирование профиля"
		profilePage.goOptionEditingProfile(driver);
		
		//Устанавливаем СМС-авторизация = Да
		profilePage.fieldSms.sendKeys(smsYes);
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
		profilePage.save(driver);
		
		//Устанавливаем СМС-авторизация = Нет
		if (smsYes.equals(profilePage.fieldSms.getText()))
			{
			//Устанавливаем СМС-авторизация = Нет
			Thread.sleep(1000);
			profilePage.fieldSms.sendKeys(smsNo);
			profilePage.fieldPassword.sendKeys(Keys.END);
			profilePage.fieldPassword.sendKeys(empty_15);
			profilePage.fieldPassword.sendKeys(parol);
			profilePage.save(driver);
			
			//проверяем конечный результат
			if (smsNo.equals(profilePage.fieldSms.getText()))
				System.out.println("EditingProfile Seventh test is pass");
				else
					System.out.println("EditingProfile Seventh test part №2 is false");
			}
			else
				System.out.println("EditingProfile Seventh test part №1 is false");
		
		//Закрываем сайт
		driver.quit();
	}

}

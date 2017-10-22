package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//8-Данные графы "СМС-авторизация" меняются на "Нет"
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
		
		//Меняем значения на Нет
		if (smsYes.equals(profilePage.fieldSms.getText()))
			{
			//Устанавливаем СМС-авторизация = Нет
			profilePage.fieldSms.sendKeys(smsNo);
			profilePage.fieldPassword.sendKeys(Keys.END);
			profilePage.fieldPassword.sendKeys(empty_15);
			profilePage.fieldPassword.sendKeys(parol);
			profilePage.save(driver);
			
			//Проверяем результат
			if (smsNo.equals(profilePage.fieldSms.getText()))
				System.out.println("EditingProfile Eighth test is pass");
				else
					System.out.println("EditingProfile Eighth test part №2 is false");
			}
			else
				System.out.println("EditingProfile Eighth test part №1 is false");
			
		//Закрываем сайт
		driver.quit();
	}

}

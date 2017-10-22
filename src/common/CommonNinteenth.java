package common;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.MainPage;
import forTests.Variables;

public class CommonNinteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//19-E-mail аккаунта и на странице клиента соответствуют
		EntrancePage entrancePage = new EntrancePage();
		MainPage mainPage = new MainPage();
																		
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
														
		//Проверяем результат
		if(textVievMail.equals(mainPage.fieldEmail.getText()))
			System.out.println("Common Ninteenth test is pass");
			else
				System.out.println("Common Ninteenth test is false");
				
		//Звкрываем сайт
		driver.quit();
	}

}

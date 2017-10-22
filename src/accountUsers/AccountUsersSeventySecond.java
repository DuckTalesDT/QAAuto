package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.MainPage;
import forTests.PvPage;
import forTests.UdpPage;
import forTests.Variables;

public class AccountUsersSeventySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//72-Просмотр данных менеджером с доступом "Доступ запрещен" не возможен
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
		UdpPage udpPage = new UdpPage();
		MainPage mainPage = new MainPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceManZapr(driver);
				
		//Нажимаем прогноз выручки
		pvPage.optionPv(driver);
		
		//Проверяем результат
		if (textHello.equals(mainPage.labelTitle.getText()))
			{	
			//Нажимаем УПД
			udpPage.optionUdp(driver);
			
			//Проверяем
			if (textHello.equals(mainPage.labelTitle.getText()))
				System.out.println("AccountUsers Seventy-second test is pass");
				else
					System.out.println("AccountUsers Seventy-second test part №2 is false");
			}
			else
				System.out.println("AccountUsers Seventy-second test part №1 is false");
							
		//Закрываем сайт
		driver.quit();
	}

}

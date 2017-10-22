package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.UdpPage;
import forTests.Variables;

public class AccountUsersEightyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//83-Просмотр данных пользователем с доступом "Только чтение" возможен
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
		UdpPage udpPage = new UdpPage();
										
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrancePolChten(driver);
				
		//Нажимаем прогноз выручки
		pvPage.optionPv(driver);
		
		//Проверяем результат
		if (partPv.equals(pvPage.labelTitle.getText()))
			{	
			//Нажимаем УПД
			udpPage.optionUdp(driver);
			
			//Проверяем
			if (partUdp.equals(udpPage.labelTitle.getText()))
				System.out.println("AccountUsers Eighty-third test is pass");
				else
					System.out.println("AccountUsers Eighty-third test part №2 is false");
			}
			else
				System.out.println("AccountUsers Eighty-third test part №1 is false");
							
		//Закрываем сайт
		driver.quit();
	}

}

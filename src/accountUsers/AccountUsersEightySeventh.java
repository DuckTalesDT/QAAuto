package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.UdpPage;
import forTests.Variables;

public class AccountUsersEightySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//87-Редактирование данных менеджером с доступом "Редактирование" возможно
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
		UdpPage udpPage = new UdpPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceManRedact(driver);
		
		//Нажимаем прогноз выручки
		pvPage.optionPv(driver);
					
		//Вносим план и кассу
		pvPage.inputPlanFirst_1000(driver);
		pvPage.inputKassaFirst_1000(driver);
		
		//Проверяем результат
		if (dataCeloe_1000.equals(pvPage.fieldPlan_1.getAttribute("value")))
			if (data_1000.equals(pvPage.fieldKassa_1.getAttribute("value")))
				{	
				//Открываем УДП
				udpPage.optionUdp(driver);
												
				//Вводим значение
				udpPage.InputDataIncome_5_1(driver);
				udpPage.InputDataRashod_3_1(driver);
				udpPage.InputOstatok(driver);
																
				//Проверяем
				if (dataCeloe_1000.equals(udpPage.fieldIncome_5_1.getText()))
					if (dataCeloe_1000.equals(udpPage.fieldRashod_3_1.getText()))
						if(dataCeloe_1000.equals(udpPage.fieldOstatok.getAttribute("value")))
							System.out.println("AccountUsers Eighty-seventh test is pass");
							else
								System.out.println("AccountUsers Eighty-seventh test part №5 is false");
						else
							System.out.println("AccountUsers Eighty-seventh test part №4 is false");
					else
						System.out.println("AccountUsers Eighty-seventh test part №3 is false");
				}
				else
					System.out.println("AccountUsers Eighty-seventh test part №2 is false");
			else
				System.out.println("AccountUsers Eighty-seventh test part №1 is false");
								
		//Закрываем сайт
		driver.quit();
		
	}
}

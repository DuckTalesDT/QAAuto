package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.UdpPage;
import forTests.Variables;

public class AccountUsersEightyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//84-Редактирование данных пользователем с доступом "Только чтение" не возможен
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
		UdpPage udpPage = new UdpPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrancePolChten(driver);
		
		//Нажимаем прогноз выручки
		pvPage.optionPv(driver);
		
		//Проверяем результат
		if (checkReadonly.equals(pvPage.fieldPlan_1.getAttribute("readonly")))
			if (checkReadonly.equals(pvPage.fieldKassa_1.getAttribute("readonly")))
				{	
				//Открываем УДП
				udpPage.optionUdp(driver);
			
				//Кликаем на ячейку для ввода значения в Поступления
				udpPage.fieldIncome_5_1.click();
			
				//Проверяем
				if (checkReadonly.equals(udpPage.fieldInputData_1.getAttribute("readonly")))
					{
					//Закрываем окно для ввода
					udpPage.buttonInputDataClose.click();
					
					//Кликаем на ячейку для ввода значения в Расходы
					udpPage.fieldRashod_3_1.click();
				
					//Проверяем
					if (checkReadonly.equals(udpPage.fieldInputData_1.getAttribute("readonly")))
						{
						//Закрываем окно для ввода
						udpPage.buttonInputDataClose.click();
						
						//Кликаем Остаток на начало месяца
						if (checkReadonly.equals(udpPage.fieldOstatok.getAttribute("readonly")))
							System.out.println("AccountUsers Eighty-fourth test is pass");
							else
								System.out.println("AccountUsers Eighty-fourth test part №5 is false");
						}
						else
							System.out.println("AccountUsers Eighty-fourth test part №4 is false");
					}
					else
						System.out.println("AccountUsers Eighty-fourth test part №3 is false");
				}
				else
					System.out.println("AccountUsers Eighty-fourth test part №2 is false");
			else
				System.out.println("AccountUsers Eighty-fourth test part №1 is false");
						
		//Закрываем сайт
		driver.quit();
		
	}

}

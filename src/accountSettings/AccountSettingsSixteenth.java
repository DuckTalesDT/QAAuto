package accountSettings;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.UdpPage;
import forTests.Variables;

public class AccountSettingsSixteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//16-Функционал "Количество редактируемых дней" не позволяет редактированть категории не вошедшие в срок
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
		UdpPage udpPage = new UdpPage();
						
		//Запускаем приложение и проходим авторизация
		entrancePage.entrance(driver);
				
		//Открываем раздел "Настройки аккаунта"
		accountPage.goOptionAccountSettinth(driver);
							
		//Печатаем новое количество редактируемых дней = 3
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_3);
										
		//Сохраняем изменения
		accountPage.buttonSave.click();
				
		//Открываем УДП
		udpPage.optionUdp(driver);
		
		//Удаляем листы УДП
		udpPage.DeleteListUdp(driver);
				
		//Создаем лист УДП
		udpPage.AddListUslugaRoznica(driver);
						
		//Переходим на месяц назад
		udpPage.GoBeforeMonth(driver);
						
		//Кликаем на ячейку для ввода значения
		udpPage.fieldIncome_5_1.click();
								
		//Вводим значение
		udpPage.fieldInputData_1.sendKeys(dataCeloe_1000);
					
		//Закрываем всплывающее окно
		udpPage.buttonPromptIncorrectDay.click();
		Thread.sleep(1000);
		
		//Проверяем результат
		if (dataEmpty.equals(udpPage.fieldInputData_1.getText()))
			System.out.println("AccountSettings Sixteenth test is pass");
			else
				System.out.println("AccountSettings Sixteenth test is false");
								
		//Удаляем листы УДП
		udpPage.DeleteListUdp(driver);
				
		//Открываем раздел "Настройки аккаунта"
		accountPage.goOptionAccountSettinth(driver);
										
		//Возвращаем "Kоличество редактируемых дней" = 60
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_60);
											
		//Сохраняем изменения
		accountPage.buttonSave.click();
						
		//Закрываем сайт
		driver.quit();
	}

}

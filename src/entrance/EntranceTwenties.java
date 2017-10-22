package entrance;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.Variables;

public class EntranceTwenties extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//20-При нажатии на логотип на странице входа в систему происходит переход на страницу самого сайти
		EntrancePage entrancePage = new EntrancePage();
		
		//Открываем сайт
		driver.get(adressSyteEntrance);
		
		//Нажимаем кнопку "Вход"
		entrancePage.buttonSyteEntrance.click();
				
		//Нажимаем на Логотип
		entrancePage.buttonLogo.click();
								
		//Проверяем результат:
		Thread.sleep(1000);
		if (partEntranceFinanceControlling.equals(entrancePage.buttonSyteEntrance.getText()))
			System.out.println("Entrance Twenties test is pass");
			else
				System.out.println("Entrance Twenties test is false");
						
		//Закрываем сайт
		driver.quit();
	}

}

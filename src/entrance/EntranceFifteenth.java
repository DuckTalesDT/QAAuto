package entrance;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.Variables;

public class EntranceFifteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//15-Переход из страницы "Вход с ситему" в страницу "Регистрация"
		EntrancePage entrancePage = new EntrancePage();
				
		//Открываем сайт
		driver.get(adressSyteEntrance);
		
		//Нажимаем кнопку "Вход"
		entrancePage.buttonSyteEntrance.click();
				
		//Нажимаем на "Регистрация"
		entrancePage.buttonRegistration.click();
								
		//Проверяем результат:
		Thread.sleep(1000);
		if (pageRegistration.equals(entrancePage.LabelRegistration.getText()))
			System.out.println("Entrance Fifteenth test is pass");
			else
				System.out.println("Entrance Fifteenth test is false");
						
		//Закрываем сайт
		driver.quit();
	}

}

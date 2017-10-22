package entrance;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.Variables;

public class EntranceThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 3-При неправильном введении E-mail вход в систему не происходит
		EntrancePage entrancePage = new EntrancePage();
		
		//Открываем сайт
		driver.get(adressSyteEntrance);
		
		//Нажимаем кнопку "Вход"
		entrancePage.buttonSyteEntrance.click();
							
		//Набираем E-mail в поле "E-mail" не правильно
		entrancePage.fieldEntranceEmail.sendKeys(mailIncorrect);
						
		//Набираем пароль в поле "Пароль"
		entrancePage.fieldEntranceParol.sendKeys(parol);
						
		//Нажимаем на кнопку "Войти"
		entrancePage.buttonEntrance.click();
						
		//Проверяем результат
		Thread.sleep(1000);
		if (pageEntrance.equals(entrancePage.LabelEntrance.getText()))
			System.out.println("Entrance Third test is pass");
			else
				System.out.println("Entrance Third test is false");
						
		//Закрываем сайт
		driver.quit();
	}

}

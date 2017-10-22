package entrance;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.Variables;

public class EntranceNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 9-При входе в систему с неверным e-mail получена подсказка
		EntrancePage entrancePage = new EntrancePage();
		
		//Открываем сайт
		driver.get(adressSyteEntrance);
		
		//Нажимаем кнопку "Вход"
		entrancePage.buttonSyteEntrance.click();
											
		//Набираем E-mail в поле "E-mail" неправильно
		entrancePage.fieldEntranceEmail.sendKeys(mailIncorrect);
								
		//Набираем пароль в поле "Пароль"
		entrancePage.fieldEntranceParol.sendKeys(parol);
								
		//Нажимаем на кнопку "Войти"
		entrancePage.buttonEntrance.click();
				
		//Проверяем результат
		Thread.sleep(1000);
		if (promptIncorrectMailEntrance.equals(entrancePage.LabelPromptIncorrectData.getText()))
			System.out.println("Entrance Ninth test is pass");
			else
				System.out.println("Entrance Ninth test is false");
			
		//Закрываем сайт
		driver.quit();
	}

}

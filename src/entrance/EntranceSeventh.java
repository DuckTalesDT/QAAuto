package entrance;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.Variables;

public class EntranceSeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 7-При не введении пароля вход в систему не происходит
		EntrancePage entrancePage = new EntrancePage();
		
		//Открываем сайт
		driver.get(adressSyteEntrance);
		
		//Нажимаем кнопку "Вход"
		entrancePage.buttonSyteEntrance.click();
											
		//Набираем E-mail в поле "E-mail"
		entrancePage.fieldEntranceEmail.sendKeys(mail);
								
		//Не набираем пароль в поле "Пароль"
		//entrancePage.fieldEntranceParol.sendKeys(parol);
								
		//Нажимаем на кнопку "Войти"
		entrancePage.buttonEntrance.click();
								
		//Проверяем результат
		Thread.sleep(3000);
		if (pageEntrance.equals(entrancePage.LabelEntrance.getText()))
			System.out.println("Entrance Seventh test is pass");
			else
				System.out.println("Entrance Seventh test is false");
							
		//Закрываем сайт
		driver.quit();
	}
}

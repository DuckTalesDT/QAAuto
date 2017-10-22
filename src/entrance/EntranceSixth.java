package entrance;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.Variables;

public class EntranceSixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 6-При не введении E-mail вход в систему не происходит
		EntrancePage entrancePage = new EntrancePage();
		
		//Открываем сайт
		driver.get(adressSyteEntrance);
		
		//Нажимаем кнопку "Вход"
		entrancePage.buttonSyteEntrance.click();
											
		//Не набираем E-mail в поле "E-mail"
		//entrancePage.fieldEntranceEmail.sendKeys(mail);
								
		//Набираем пароль в поле "Пароль"
		entrancePage.fieldEntranceParol.sendKeys(parol);
								
		//Нажимаем на кнопку "Войти"
		entrancePage.buttonEntrance.click();
								
		//Проверяем результат
		Thread.sleep(3000);
		if (pageEntrance.equals(entrancePage.LabelEntrance.getText()))
			System.out.println("Entrance Sixth test is pass");
			else
				System.out.println("Entrance Sixth test is false");
						
		//Закрываем сайт
		driver.quit();
	}

}

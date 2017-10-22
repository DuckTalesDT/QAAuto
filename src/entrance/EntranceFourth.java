package entrance;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.Variables;

public class EntranceFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//4-При неправильном введении пароля вход в систему не происходит
		EntrancePage entrancePage = new EntrancePage();
		
		//Открываем сайт
		driver.get(adressSyteEntrance);
		
		//Нажимаем кнопку "Вход"
		entrancePage.buttonSyteEntrance.click();
									
		//Набираем E-mail в поле "E-mail"
		entrancePage.fieldEntranceEmail.sendKeys(mail);
								
		//Набираем пароль в поле "Пароль" неверный
		entrancePage.fieldEntranceParol.sendKeys(parolIncorrect);
								
		//Нажимаем на кнопку "Войти"
		entrancePage.buttonEntrance.click();
								
		//Проверяем результат
		Thread.sleep(1000);
		if (pageEntrance.equals(entrancePage.LabelEntrance.getText()))
			System.out.println("Entrance Fourth test is pass");
		  	else
		  		System.out.println("Entrance Fourth test is false");
								
		//Закрываем сайт
		driver.quit();
	}

}

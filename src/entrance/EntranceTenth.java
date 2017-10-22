package entrance;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.EntrancePage;
import forTests.Variables;

public class EntranceTenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 10-Получение подсказки при входе в систему с неверным паролем
		EntrancePage entrancePage = new EntrancePage();
		
		//Открываем сайт
		driver.get(adressSyteEntrance);
		
		//Нажимаем кнопку "Вход"
		entrancePage.buttonSyteEntrance.click();
		
		//Набираем E-mail в поле "E-mail"
		entrancePage.fieldEntranceEmail.sendKeys(mail);
						
		//Набираем пароль в поле "Пароль" не верный
		entrancePage.fieldEntranceParol.sendKeys(parolIncorrect);
							
		//Нажимаем на кнопку "Войти"
		entrancePage.buttonEntrance.click();
								
		//Проверяем результат
		Thread.sleep(1000);
		if (promptIncorrectMailEntrance.equals(driver.findElement(By.id("pre-login-error")).getText()))
			System.out.println("Entrance Tenth test is pass");
			else
				System.out.println("Entrance Tenth test is false");
								
		//Закрываем сайт
		Thread.sleep(1000);
		driver.close();
	}

}

package passwordRecovery;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.Variables;

public class PasswordRecoverySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 2-Восстановление пароля через функцию "Забыли свой пароль ?" при неверно введенном E-mail не производится
		EntrancePage entrancePage = new EntrancePage();
										
		//Нажимаем "Забыли свой пароль?"
		entrancePage.buttonRepeatPassword.click();
				
		//Набираем неправильный E-mail в графе E-mail
		entrancePage.fieldEntranceEmailNewPassword.sendKeys(mailIncorrect);
				
		//Нажимаем "Отправить"
		entrancePage.buttonRepeatDispach.click();
				
		//Проверяем результат
		Thread.sleep(1000);
		if (pageRecoveryParol.equals(entrancePage.LabelChangePassword.getText()))
			System.out.println("PasswordRecovery Second test is pass");
			else
				System.out.println("PasswordRecovery Second test is false");
							
		//Закрываем сайт
		driver.quit();
	}

}

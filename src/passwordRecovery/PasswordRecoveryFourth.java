package passwordRecovery;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.Variables;

public class PasswordRecoveryFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 4-Получение подсказки при попытке восстановить пароль через функцию "Забыли свой пароль?" при неверно введенном e-mail
		EntrancePage entrancePage = new EntrancePage();
										
		//Нажимаем "Забыли свой пароль?"
		entrancePage.buttonRepeatPassword.click();
				
		//Набираем неправильный E-mail в графе E-mail
		entrancePage.fieldEntranceEmailNewPassword.sendKeys(mailIncorrect);
				
		//Нажимаем "Отправить"
		entrancePage.buttonRepeatDispach.click();
				
		//Проверяем результат
		Thread.sleep(1000);
		if (promptIncorrectMailPasswordRecovery.equals(entrancePage.LabelPromptRepeatIncorrectEmail.getText()))
			System.out.println("PasswordRecovery Fourth test is pass");
			else
				System.out.println("PasswordRecovery Fourth test is false");
							
		//Закрываем сайт
		driver.quit();
	}

}

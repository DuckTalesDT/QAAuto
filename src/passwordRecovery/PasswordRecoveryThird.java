package passwordRecovery;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.Variables;

public class PasswordRecoveryThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//3-Восстановление пароля через функцию "Забыли свой пароль ?" при не введенном E-mail не производится
		EntrancePage entrancePage = new EntrancePage();
		
		//Нажимаем "Забыли свой пароль?"
		entrancePage.buttonRepeatPassword.click();
			
		//Не набираем E-mail в графе E-mail
		//entrancePage.fieldEntranceEmailNewPassword.sendKeys(mail);
				
		//Нажимаем "Отправить"
		entrancePage.buttonRepeatDispach.click();
				
		//Проверяем результат
		Thread.sleep(1000);
		if (pageRecoveryParol.equals(entrancePage.LabelChangePassword.getText()))
			System.out.println("PasswordRecovery Third test is pass");
			else
				System.out.println("PasswordRecovery Third test is false");
				
		//Закрываем сайт
		driver.quit();
	}

}

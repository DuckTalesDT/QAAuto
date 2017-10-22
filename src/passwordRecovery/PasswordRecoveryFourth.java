package passwordRecovery;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.Variables;

public class PasswordRecoveryFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 4-��������� ��������� ��� ������� ������������ ������ ����� ������� "������ ���� ������?" ��� ������� ��������� e-mail
		EntrancePage entrancePage = new EntrancePage();
										
		//�������� "������ ���� ������?"
		entrancePage.buttonRepeatPassword.click();
				
		//�������� ������������ E-mail � ����� E-mail
		entrancePage.fieldEntranceEmailNewPassword.sendKeys(mailIncorrect);
				
		//�������� "���������"
		entrancePage.buttonRepeatDispach.click();
				
		//��������� ���������
		Thread.sleep(1000);
		if (promptIncorrectMailPasswordRecovery.equals(entrancePage.LabelPromptRepeatIncorrectEmail.getText()))
			System.out.println("PasswordRecovery Fourth test is pass");
			else
				System.out.println("PasswordRecovery Fourth test is false");
							
		//��������� ����
		driver.quit();
	}

}

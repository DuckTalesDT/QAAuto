package passwordRecovery;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.Variables;

public class PasswordRecoverySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 2-�������������� ������ ����� ������� "������ ���� ������ ?" ��� ������� ��������� E-mail �� ������������
		EntrancePage entrancePage = new EntrancePage();
										
		//�������� "������ ���� ������?"
		entrancePage.buttonRepeatPassword.click();
				
		//�������� ������������ E-mail � ����� E-mail
		entrancePage.fieldEntranceEmailNewPassword.sendKeys(mailIncorrect);
				
		//�������� "���������"
		entrancePage.buttonRepeatDispach.click();
				
		//��������� ���������
		Thread.sleep(1000);
		if (pageRecoveryParol.equals(entrancePage.LabelChangePassword.getText()))
			System.out.println("PasswordRecovery Second test is pass");
			else
				System.out.println("PasswordRecovery Second test is false");
							
		//��������� ����
		driver.quit();
	}

}

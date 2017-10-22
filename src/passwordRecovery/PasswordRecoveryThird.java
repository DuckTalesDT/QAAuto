package passwordRecovery;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.Variables;

public class PasswordRecoveryThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//3-�������������� ������ ����� ������� "������ ���� ������ ?" ��� �� ��������� E-mail �� ������������
		EntrancePage entrancePage = new EntrancePage();
		
		//�������� "������ ���� ������?"
		entrancePage.buttonRepeatPassword.click();
			
		//�� �������� E-mail � ����� E-mail
		//entrancePage.fieldEntranceEmailNewPassword.sendKeys(mail);
				
		//�������� "���������"
		entrancePage.buttonRepeatDispach.click();
				
		//��������� ���������
		Thread.sleep(1000);
		if (pageRecoveryParol.equals(entrancePage.LabelChangePassword.getText()))
			System.out.println("PasswordRecovery Third test is pass");
			else
				System.out.println("PasswordRecovery Third test is false");
				
		//��������� ����
		driver.quit();
	}

}

package entrance;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.Variables;

public class EntranceSeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 7-��� �� �������� ������ ���� � ������� �� ����������
		EntrancePage entrancePage = new EntrancePage();
		
		//��������� ����
		driver.get(adressSyteEntrance);
		
		//�������� ������ "����"
		entrancePage.buttonSyteEntrance.click();
											
		//�������� E-mail � ���� "E-mail"
		entrancePage.fieldEntranceEmail.sendKeys(mail);
								
		//�� �������� ������ � ���� "������"
		//entrancePage.fieldEntranceParol.sendKeys(parol);
								
		//�������� �� ������ "�����"
		entrancePage.buttonEntrance.click();
								
		//��������� ���������
		Thread.sleep(3000);
		if (pageEntrance.equals(entrancePage.LabelEntrance.getText()))
			System.out.println("Entrance Seventh test is pass");
			else
				System.out.println("Entrance Seventh test is false");
							
		//��������� ����
		driver.quit();
	}
}

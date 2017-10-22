package entrance;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.Variables;

public class EntranceNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 9-��� ����� � ������� � �������� e-mail �������� ���������
		EntrancePage entrancePage = new EntrancePage();
		
		//��������� ����
		driver.get(adressSyteEntrance);
		
		//�������� ������ "����"
		entrancePage.buttonSyteEntrance.click();
											
		//�������� E-mail � ���� "E-mail" �����������
		entrancePage.fieldEntranceEmail.sendKeys(mailIncorrect);
								
		//�������� ������ � ���� "������"
		entrancePage.fieldEntranceParol.sendKeys(parol);
								
		//�������� �� ������ "�����"
		entrancePage.buttonEntrance.click();
				
		//��������� ���������
		Thread.sleep(1000);
		if (promptIncorrectMailEntrance.equals(entrancePage.LabelPromptIncorrectData.getText()))
			System.out.println("Entrance Ninth test is pass");
			else
				System.out.println("Entrance Ninth test is false");
			
		//��������� ����
		driver.quit();
	}

}

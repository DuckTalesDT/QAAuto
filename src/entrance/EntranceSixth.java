package entrance;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.Variables;

public class EntranceSixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 6-��� �� �������� E-mail ���� � ������� �� ����������
		EntrancePage entrancePage = new EntrancePage();
		
		//��������� ����
		driver.get(adressSyteEntrance);
		
		//�������� ������ "����"
		entrancePage.buttonSyteEntrance.click();
											
		//�� �������� E-mail � ���� "E-mail"
		//entrancePage.fieldEntranceEmail.sendKeys(mail);
								
		//�������� ������ � ���� "������"
		entrancePage.fieldEntranceParol.sendKeys(parol);
								
		//�������� �� ������ "�����"
		entrancePage.buttonEntrance.click();
								
		//��������� ���������
		Thread.sleep(3000);
		if (pageEntrance.equals(entrancePage.LabelEntrance.getText()))
			System.out.println("Entrance Sixth test is pass");
			else
				System.out.println("Entrance Sixth test is false");
						
		//��������� ����
		driver.quit();
	}

}

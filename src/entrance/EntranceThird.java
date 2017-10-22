package entrance;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.Variables;

public class EntranceThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 3-��� ������������ �������� E-mail ���� � ������� �� ����������
		EntrancePage entrancePage = new EntrancePage();
		
		//��������� ����
		driver.get(adressSyteEntrance);
		
		//�������� ������ "����"
		entrancePage.buttonSyteEntrance.click();
							
		//�������� E-mail � ���� "E-mail" �� ���������
		entrancePage.fieldEntranceEmail.sendKeys(mailIncorrect);
						
		//�������� ������ � ���� "������"
		entrancePage.fieldEntranceParol.sendKeys(parol);
						
		//�������� �� ������ "�����"
		entrancePage.buttonEntrance.click();
						
		//��������� ���������
		Thread.sleep(1000);
		if (pageEntrance.equals(entrancePage.LabelEntrance.getText()))
			System.out.println("Entrance Third test is pass");
			else
				System.out.println("Entrance Third test is false");
						
		//��������� ����
		driver.quit();
	}

}

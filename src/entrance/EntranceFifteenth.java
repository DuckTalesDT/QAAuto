package entrance;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.Variables;

public class EntranceFifteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//15-������� �� �������� "���� � ������" � �������� "�����������"
		EntrancePage entrancePage = new EntrancePage();
				
		//��������� ����
		driver.get(adressSyteEntrance);
		
		//�������� ������ "����"
		entrancePage.buttonSyteEntrance.click();
				
		//�������� �� "�����������"
		entrancePage.buttonRegistration.click();
								
		//��������� ���������:
		Thread.sleep(1000);
		if (pageRegistration.equals(entrancePage.LabelRegistration.getText()))
			System.out.println("Entrance Fifteenth test is pass");
			else
				System.out.println("Entrance Fifteenth test is false");
						
		//��������� ����
		driver.quit();
	}

}

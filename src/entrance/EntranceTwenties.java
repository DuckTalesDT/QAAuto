package entrance;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.Variables;

public class EntranceTwenties extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//20-��� ������� �� ������� �� �������� ����� � ������� ���������� ������� �� �������� ������ �����
		EntrancePage entrancePage = new EntrancePage();
		
		//��������� ����
		driver.get(adressSyteEntrance);
		
		//�������� ������ "����"
		entrancePage.buttonSyteEntrance.click();
				
		//�������� �� �������
		entrancePage.buttonLogo.click();
								
		//��������� ���������:
		Thread.sleep(1000);
		if (partEntranceFinanceControlling.equals(entrancePage.buttonSyteEntrance.getText()))
			System.out.println("Entrance Twenties test is pass");
			else
				System.out.println("Entrance Twenties test is false");
						
		//��������� ����
		driver.quit();
	}

}

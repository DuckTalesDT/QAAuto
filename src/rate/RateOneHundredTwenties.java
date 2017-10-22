package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class RateOneHundredTwenties extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//120-"������� �������" ����������� ��� ������ "�����������" � ������� "������� �������"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entranceStandPv(driver);
				
		//�������� "������� �������"
		pvPage.optionPv(driver);
		
		//��������� ���������
		if (partPv.equals(pvPage.labelTitle.getText()))
			System.out.println("Rate One hundred twenties test is pass");
			else
				System.out.println("Rate One hundred twenties test is false");
		
		//��������� ����
		driver.quit();		
	}

}

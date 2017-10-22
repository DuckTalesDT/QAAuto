package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class RateOneHundredThirtySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//132-"������� �������" ����������� ��� ������ "������������" � ������� "������� �������"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
										
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaximPv(driver);
				
		//�������� "������� �������"
		pvPage.optionPv(driver);
		
		//��������� ���������
		if (partPv.equals(pvPage.labelTitle.getText()))
			System.out.println("Rate One hundred thirty-second test is pass");
			else
				System.out.println("Rate One hundred thirty-second test is false");
		
		//��������� ����
		driver.quit();		
	}

}

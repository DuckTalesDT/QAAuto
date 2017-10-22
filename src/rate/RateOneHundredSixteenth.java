package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class RateOneHundredSixteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//116-"������� �������" ����������� ��� ������ "�����������" � ������ ������� �����
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptim(driver);
				
		//�������� "������� �������"
		pvPage.optionPv(driver);
		
		//��������� ���������
		if (partPv.equals(pvPage.labelTitle.getText()))
			System.out.println("Rate One hundred sixteenth test is pass");
			else
				System.out.println("Rate One hundred sixteenth test is false");
		
		//��������� ����
		driver.quit();				
	}

}

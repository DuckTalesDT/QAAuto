package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.UdpPage;
import forTests.Variables;

public class RateOneHundredThirtyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//134-"������� �������" �� ����������� ���  ������ "������������" � ������� "���������� ��������� ��������"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
		UdpPage udpPage = new UdpPage();
										
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaximUdp(driver);
				
		//�������� "������� �������"
		pvPage.optionPv(driver);
		
		//��������� ���������
		if (partUdp.equals(udpPage.labelTitle.getText()))
			System.out.println("Rate One hundred thirty-fourth test is pass");
			else
				System.out.println("Rate One hundred thirty-fourth test is false");
		
		//��������� ����
		driver.quit();		
	}

}

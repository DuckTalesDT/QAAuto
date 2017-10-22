package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.UdpPage;
import forTests.Variables;

public class RateOneHundredTwentyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//124-"���������� ��������� ��������" �� ����������� ��� ������ "�����������" � ������� "������� �������"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
		UdpPage udpPage = new UdpPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entranceStandPv(driver);
				
		//�������� "���������� ��������� ��������"
		udpPage.optionUdp(driver);
		
		//��������� ���������
		if (partPv.equals(pvPage.labelTitle.getText()))
			System.out.println("Rate One hundred twenty-fourth test is pass");
			else
				System.out.println("Rate One hundred twenty-fourth test is false");
		
		//��������� ����
		driver.quit();		
	}

}

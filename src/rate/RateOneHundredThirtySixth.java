package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.UdpPage;
import forTests.Variables;

public class RateOneHundredThirtySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//136-"���������� ��������� ��������" �� ����������� ��� ������ "������������" � ������� "������� �������"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
		UdpPage udpPage = new UdpPage();
										
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaximPv(driver);
				
		//�������� "���������� ��������� ��������"
		udpPage.optionUdp(driver);
		
		//��������� ���������
		if (partPv.equals(pvPage.labelTitle.getText()))
			System.out.println("Rate One hundred thirty-sixth test is pass");
			else
				System.out.println("Rate One hundred thirty-sixth test is false");
		
		//��������� ����
		driver.quit();		
	}

}

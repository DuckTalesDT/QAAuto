package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UdpPage;
import forTests.Variables;

public class RateOneHundredThirtyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//133-"���������� ��������� ��������" ����������� ���  ������ "������������" � ������� "���������� ��������� ��������"
		EntrancePage entrancePage = new EntrancePage();
		UdpPage udpPage = new UdpPage();
										
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaximUdp(driver);
				
		//�������� "���������� ��������� ��������"
		udpPage.optionUdp(driver);
		
		//��������� ���������
		if (partUdp.equals(udpPage.labelTitle.getText()))
			System.out.println("Rate One hundred thirty-third test is pass");
			else
				System.out.println("Rate One hundred thirty-third test is false");
		
		//��������� ����
		driver.quit();		
	}

}

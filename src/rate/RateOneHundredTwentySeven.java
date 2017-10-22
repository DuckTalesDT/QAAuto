package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UdpPage;
import forTests.Variables;

public class RateOneHundredTwentySeven extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//127-"���������� ��������� ��������" ����������� ���  ������ "�����������" � ������� "���������� ��������� ��������"
		EntrancePage entrancePage = new EntrancePage();
		UdpPage udpPage = new UdpPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptimUdp(driver);
				
		//�������� "���������� ��������� ��������"
		udpPage.optionUdp(driver);
		
		//��������� ���������
		if (partUdp.equals(udpPage.labelTitle.getText()))
			System.out.println("Rate One hundred twenty-seventh test is pass");
			else
				System.out.println("Rate One hundred twenty-seventh test is false");
		
		//��������� ����
		driver.quit();				
	}

}

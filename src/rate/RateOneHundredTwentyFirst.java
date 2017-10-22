package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UdpPage;
import forTests.Variables;

public class RateOneHundredTwentyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//121-"���������� ��������� ��������" ����������� ���  ������ "�����������" � ������� "���������� ��������� ��������"
		EntrancePage entrancePage = new EntrancePage();
		UdpPage udpPage = new UdpPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entranceStandUdp(driver);
				
		//�������� "���������� ��������� ��������"
		udpPage.optionUdp(driver);
		
		//��������� ���������
		if (partUdp.equals(udpPage.labelTitle.getText()))
			System.out.println("Rate One hundred twenty-first test is pass");
			else
				System.out.println("Rate One hundred twenty-first test is false");
		
		//��������� ����
		driver.quit();		
	}

}

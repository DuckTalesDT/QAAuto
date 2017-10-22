package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UdpPage;
import forTests.Variables;

public class RateOneHundredSeventeenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//117-"���������� ��������� ��������"  ����������� ��� ������ "�����������" � ������ ������� �����
		EntrancePage entrancePage = new EntrancePage();
		UdpPage udpPage = new UdpPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptim(driver);
				
		//�������� "���������� ��������� ��������"
		udpPage.optionUdp(driver);
		
		//��������� ���������
		if (partUdp.equals(udpPage.labelTitle.getText()))
			System.out.println("Rate One hundred seventeenth test is pass");
			else
				System.out.println("Rate One hundred seventeenth test is false");
		
		//��������� ����
		driver.quit();		
	}

}

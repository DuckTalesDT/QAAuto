package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UdpPage;
import forTests.Variables;

public class RateOneHundredFifteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//115-"���������� ��������� ��������"  ����������� ���  ������ "�����������" � ������ ������� �����
		EntrancePage entrancePage = new EntrancePage();
		UdpPage udpPage = new UdpPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entranceStand(driver);
				
		//�������� "���������� ��������� ��������"
		udpPage.optionUdp(driver);
		
		//��������� ���������
		if (partUdp.equals(udpPage.labelTitle.getText()))
			System.out.println("Rate One hundred fifteenth test is pass");
			else
				System.out.println("Rate One hundred fifteenth test is false");
		
		//��������� ����
		driver.quit();		
	}

}

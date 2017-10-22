package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UdpPage;
import forTests.Variables;

public class RateOneHundredEleventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//111-"���������� ��������� ��������" ����������� ��� ������ "������������"
		EntrancePage entrancePage = new EntrancePage();
		UdpPage udpPage = new UdpPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entrancePers(driver);
				
		//�������� "���������� ��������� ��������"
		udpPage.optionUdp(driver);
		
		//��������� ���������
		if (partUdp.equals(udpPage.labelTitle.getText()))
			System.out.println("Rate One hundred eleventh test is pass");
			else
				System.out.println("Rate One hundred eleventh test is false");
		
		//��������� ����
		driver.quit();		
	}

}

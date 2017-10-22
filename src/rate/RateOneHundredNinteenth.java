package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UdpPage;
import forTests.Variables;

public class RateOneHundredNinteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//119-"���������� ��������� ��������"  ����������� ���  ������ "������������" � ������ ������� �����
		EntrancePage entrancePage = new EntrancePage();
		UdpPage udpPage = new UdpPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaxim(driver);
				
		//�������� "���������� ��������� ��������"
		udpPage.optionUdp(driver);
		
		//��������� ���������
		if (partUdp.equals(udpPage.labelTitle.getText()))
			System.out.println("Rate One hundred ninteenth test is pass");
			else
				System.out.println("Rate One hundred ninteenth test is false");
		
		//��������� ����
		driver.quit();			
	}

}

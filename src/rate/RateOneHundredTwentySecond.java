package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.UdpPage;
import forTests.Variables;

public class RateOneHundredTwentySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//122-"������� �������" �� ����������� ���  ������ "�����������" � ������� "���������� ��������� ��������"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
		UdpPage udpPage = new UdpPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entranceStandUdp(driver);
				
		//�������� "������� �������"
		pvPage.optionPv(driver);
		
		//��������� ���������
		if (partUdp.equals(udpPage.labelTitle.getText()))
			System.out.println("Rate One hundred twenty-second test is pass");
			else
				System.out.println("Rate One hundred twenty-second test is false");
		
		//��������� ����
		driver.quit();		
	}

}

package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.UdpPage;
import forTests.Variables;

public class RateOneHundredTwentyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//128-"������� �������" �� ����������� ���  ������ "�����������" � ������� "���������� ��������� ��������"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
		UdpPage udpPage = new UdpPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptimUdp(driver);
				
		//�������� "������� �������"
		pvPage.optionPv(driver);
		
		//��������� ���������
		if (partUdp.equals(udpPage.labelTitle.getText()))
			System.out.println("Rate One hundred twenty-eighth test is pass");
			else
				System.out.println("Rate One hundred twenty-eighth test is false");
		
		//��������� ����
		driver.quit();		
	}

}

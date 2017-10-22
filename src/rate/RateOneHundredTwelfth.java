package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.UdpPage;
import forTests.Variables;

public class RateOneHundredTwelfth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//112-"������� �������" �� ����������� ��� ������ "������������"
		EntrancePage entrancePage = new EntrancePage();
		UdpPage udpPage = new UdpPage();
		PvPage pvPage = new PvPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entrancePers(driver);
				
		//�������� "������� �������"
		pvPage.optionPv(driver);
		
		//��������� ���������
		if (partUdp.equals(udpPage.labelTitle.getText()))
			System.out.println("Rate One hundred twelfth test is pass");
			else
				System.out.println("Rate One hundred twelfth test is false");
		
		//��������� ����
		driver.quit();		
	}

}

package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UdpPage;
import forTests.Variables;

public class RateOneHundredThirtySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//137-�������� ��������� ��� �������� "���������� ��������� ��������" ��� ������ "������������" � ������� "������� �������"
		EntrancePage entrancePage = new EntrancePage();
		UdpPage udpPage = new UdpPage();
				
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaximPv(driver);
								
		//�������� ���������
		String toolTipText = udpPage.promptUdpDontOpen(driver);

		//��������� ���������
		if (promptPartUdp.equals(toolTipText))
			System.out.println("Rate One hundred thirty-seventh test is pass");
			else
				System.out.println("Rate One hundred thirty-seventh test is false");
																
		//��������� ����
		driver.quit();
		
	}
}

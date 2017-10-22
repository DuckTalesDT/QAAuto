package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UdpPage;
import forTests.Variables;

public class RateOneHundredThirtyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//131-�������� ��������� ��� �������� "���������� ��������� ��������" ��� ������ "�����������" � ������� "������� �������"
		EntrancePage entrancePage = new EntrancePage();
		UdpPage udpPage = new UdpPage();
				
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptimPv(driver);
								
		//�������� ���������
		String toolTipText = udpPage.promptUdpDontOpen(driver);

		//��������� ���������
		if (promptPartUdp.equals(toolTipText))
			System.out.println("Rate One hundred thirty-first test is pass");
			else
				System.out.println("Rate One hundred thirty-first test is false");
																
		//��������� ����
		driver.quit();
		
	}
}

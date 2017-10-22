package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UdpPage;
import forTests.Variables;

public class RateOneHundredTwentyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//125-�������� ��������� ��� �������� "���������� ��������� ��������" ��� ������ "�����������" � ������� "������� �������"
		EntrancePage entrancePage = new EntrancePage();
		UdpPage udpPage = new UdpPage();
				
		//��������� ���������� � �������� �����������
		entrancePage.entranceStandPv(driver);
								
		//�������� ���������
		String toolTipText = udpPage.promptUdpDontOpen(driver);

		//��������� ���������
		if (promptPartUdp.equals(toolTipText))
			System.out.println("Rate One hundred twenty-fifth test is pass");
			else
				System.out.println("Rate One hundred twenty-fifth test is false");
																
		//��������� ����
		driver.quit();
		
	}
}

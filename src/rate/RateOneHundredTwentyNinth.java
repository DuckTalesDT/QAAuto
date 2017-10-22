package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class RateOneHundredTwentyNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//129-�������� ��������� ��� �������� "������� �������" ��� ������ "�����������" � ������� "���������� ��������� ��������"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
				
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptimUdp(driver);
								
		//�������� ���������
		String toolTipText = pvPage.promptPvDontOpen(driver);

		//��������� ���������
		if (promptPartPv.equals(toolTipText))
			System.out.println("Rate One hundred twenty-ninth test is pass");
			else
				System.out.println("Rate One hundred twenty-ninth test is false");
																
		//��������� ����
		driver.quit();
		
	}
}

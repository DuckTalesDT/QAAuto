package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class RateOneHundredThirtyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//135-�������� ��������� ��� �������� "������� �������" ��� ������ "������������" � ������� "���������� ��������� ��������"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
				
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaximUdp(driver);
								
		//�������� ���������
		String toolTipText = pvPage.promptPvDontOpen(driver);

		//��������� ���������
		if (promptPartPv.equals(toolTipText))
			System.out.println("Rate One hundred thirty-fifth test is pass");
			else
				System.out.println("Rate One hundred thirty-fifth test is false");
																
		//��������� ����
		driver.quit();
		
	}
}

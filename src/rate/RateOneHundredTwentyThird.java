package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class RateOneHundredTwentyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//123-�������� ��������� ��� �������� "������� �������" ��� ������ "�����������" � ������� "���������� ��������� ��������"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
				
		//��������� ���������� � �������� �����������
		entrancePage.entranceStandUdp(driver);
								
		//�������� ���������
		String toolTipText = pvPage.promptPvDontOpen(driver);

		//��������� ���������
		if (promptPartPv.equals(toolTipText))
			System.out.println("Rate One hundred twenty-third test is pass");
			else
				System.out.println("Rate One hundred twenty-third test is false");
																
		//��������� ����
		driver.quit();
		
	}
}

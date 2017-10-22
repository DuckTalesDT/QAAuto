package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class RateOneHundredThirteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//113-�������� ��������� ��� �������� "������� �������" ��� ������ "������������"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
				
		//��������� ���������� � �������� �����������
		entrancePage.entrancePers(driver);
					
		//�������� ���������
		String toolTipText = pvPage.promptPvDontOpen(driver);

		//��������� ���������
		if (promptPartPv.equals(toolTipText))
			System.out.println("Rate One hundred thirteenth test is pass");
			else
				System.out.println("Rate One hundred thirteenth test is false");
																
		//��������� ����
		driver.quit();
		
	}

}

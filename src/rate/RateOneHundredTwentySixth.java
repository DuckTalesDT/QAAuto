package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class RateOneHundredTwentySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//126-"������� �������" ����������� ��� ������ "�����������" � ������� "������� �������"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptimPv(driver);
				
		//�������� "������� �������"
		pvPage.optionPv(driver);
		
		//��������� ���������
		if (partPv.equals(pvPage.labelTitle.getText()))
			System.out.println("Rate One hundred twenty-sixth test is pass");
			else
				System.out.println("Rate One hundred twenty-sixth test is false");
		
		//��������� ����
		driver.quit();		
	}

}

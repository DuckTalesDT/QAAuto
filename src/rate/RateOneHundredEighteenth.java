package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class RateOneHundredEighteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//118-"������� �������" ����������� ��� ������ "������������" � ������ ������� �����
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaxim(driver);
				
		//�������� "������� �������"
		pvPage.optionPv(driver);
		
		//��������� ���������
		if (partPv.equals(pvPage.labelTitle.getText()))
			System.out.println("Rate One hundred eighteenth test is pass");
			else
				System.out.println("Rate One hundred eighteenth test is false");
		
		//��������� ����
		driver.quit();		
	}

}

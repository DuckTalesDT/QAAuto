package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class RateOneHundredFourteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//114-"������� �������" ����������� ��� ������ "�����������" � ������ ������� �����
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entranceStand(driver);
				
		//�������� "������� �������"
		pvPage.optionPv(driver);
		
		//��������� ���������
		if (partPv.equals(pvPage.labelTitle.getText()))
			System.out.println("Rate One hundred forteenth test is pass");
			else
				System.out.println("Rate One hundred forteenth test is false");
		
		//��������� ����
		driver.quit();		
	}

}

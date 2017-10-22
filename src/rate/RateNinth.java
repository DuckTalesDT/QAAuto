package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//9-�������� ����� ���� ������ "�����������" ������ ����� � $
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptim(driver);
											
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
		
		//��������� ���������
		if (priceDolOptim.equals(tarifPage.labelOptimPriceUsd.getText()))
			System.out.println("Rate Ninth test is pass");
			else
				System.out.println("Rate Ninth test is false");
		
		//��������� ����
		driver.quit();
	}

}

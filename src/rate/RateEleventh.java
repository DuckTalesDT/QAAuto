package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateEleventh extends Variables {
	@Test
	public void test() throws InterruptedException{
		//11-�������� ����� ���� ������ "�����������" � ������� "������� �������" � $
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptimPv(driver);
											
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
		
		//��������� ���������
		if (priceDolOptimPv.equals(tarifPage.labelOptimPriceUsd.getText()))
			System.out.println("Rate Eleventh test is pass");
			else
				System.out.println("Rate Eleventh test is false");
		
		//��������� ����
		driver.quit();
	}

}

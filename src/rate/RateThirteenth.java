package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateThirteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//13-�������� ����� ���� ������ "�����������" � ������� "���������� ��������� ��������" � $
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptimUdp(driver);
											
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
		
		//��������� ���������
		if (priceDolOptimUdp.equals(tarifPage.labelOptimPriceUsd.getText()))
			System.out.println("Rate Thirteenth test is pass");
			else
				System.out.println("Rate Thirteenth test is false");
														
		//��������� ����
		driver.quit();
	}
}

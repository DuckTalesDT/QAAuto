package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//5-�������� ����� ���� ������ "�����������" � ������� "������� �������" � $
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceStandPv(driver);
											
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
		
		//��������� ���������
		if (priceDolStandPv.equals(tarifPage.labelStandPriceUsd.getText()))
			System.out.println("Rate Fifth test is pass");
			else
				System.out.println("Rate Fifth test is false");
														
		//��������� ����
		driver.quit();
		
	}
}

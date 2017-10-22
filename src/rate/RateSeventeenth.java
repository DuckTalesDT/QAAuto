package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateSeventeenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//17-�������� ����� ���� ������ "������������" � ������� "������� �������" � $
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaximPv(driver);
											
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
				
		//��������� ���������
		if (priceDolMaximPv.equals(tarifPage.labelMaximPriceUsd.getText()))
			System.out.println("Rate Seventeenth test is pass");
			else
				System.out.println("Rate Seventeenth test is false");
																
		//��������� ����
		driver.quit();
	
	}

}

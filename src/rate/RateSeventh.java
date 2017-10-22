package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateSeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//7-�������� ����� ���� ������ "�����������" � ������� "���������� ��������� ��������" � $
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceStandUdp(driver);
											
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
		
		//��������� ���������
		if (priceDolStandUdp.equals(tarifPage.labelStandPriceUsd.getText()))
			System.out.println("Rate Seventh test is pass");
			else
				System.out.println("Rate Seventh test is false");
		
		//��������� ����
		driver.quit();
	}

}

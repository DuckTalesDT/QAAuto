package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateNinteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//19-�������� ����� ���� ������ "������������" � ������� "���������� ��������� ��������" � $
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaximUdp(driver);
											
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
		
		//��������� ���������
		if (priceDolMaximUdp.equals(tarifPage.labelMaximPriceUsd.getText()))
			System.out.println("Rate Ninteenth test is pass");
			else
				System.out.println("Rate Ninteenth test is false");
														
		//��������� ����
		driver.quit();
	}

}

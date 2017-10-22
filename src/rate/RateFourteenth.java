package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateFourteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//14-�������� ����� ���� ������ "�����������" � ������� "���������� ��������� ��������" � UAH
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptimUdp(driver);
											
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
		
		//��������� ���������
		if (priceUahOptimUdp.equals(tarifPage.labelOptimPriceUah.getText()))
			System.out.println("Rate Fourteenth test is pass");
			else
				System.out.println("Rate Fourteenth test is false");
														
		//��������� ����
		driver.quit();
	}
}

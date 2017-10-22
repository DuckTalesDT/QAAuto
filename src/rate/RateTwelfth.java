package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateTwelfth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//12-�������� ����� ���� ������ "�����������" � ������� "������� �������" � UAH
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptimPv(driver);
											
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
		
		//��������� ���������
		if (priceUahOptimPv.equals(tarifPage.labelOptimPriceUah.getText()))
			System.out.println("Rate Twelfth test is pass");
			else
				System.out.println("Rate Twelfth test is false");
		
		//��������� ����
		driver.quit();
		
	}

}

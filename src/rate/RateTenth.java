package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateTenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//10-�������� ����� ���� ������ "�����������" ������ ����� � UAH
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptim(driver);
											
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
		
		//��������� ���������
		if (priceUahOptim.equals(tarifPage.labelOptimPriceUah.getText()))
			System.out.println("Rate Tenth test is pass");
			else
				System.out.println("Rate Tenth test is false");
		
		//��������� ����
		driver.quit();
	}
}

package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateEighteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//18-�������� ����� ���� ������ "������������" � ������� "������� �������" � UAH
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaximPv(driver);
											
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
				
		//��������� ���������
		if (priceUahMaximPv.equals(tarifPage.labelMaximPriceUah.getText()))
			System.out.println("Rate Eighteenth test is pass");
			else
				System.out.println("Rate Eighteenth test is false");
														
		//��������� ����
		driver.quit();
	}
}

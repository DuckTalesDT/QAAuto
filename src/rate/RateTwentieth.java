package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateTwentieth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//20-�������� ����� ���� ������ "������������" � ������� "���������� ��������� ��������" � UAH
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaximUdp(driver);
											
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
		
		//��������� ���������
		if (priceUahMaximUdp.equals(tarifPage.labelMaximPriceUah.getText()))
			System.out.println("Rate Twentieth test is pass");
			else
				System.out.println("Rate Twentieth test is false");
														
		//��������� ����
		driver.quit();
	}

}

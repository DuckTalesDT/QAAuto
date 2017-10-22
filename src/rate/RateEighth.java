package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//8-�������� ����� ���� ������ "�����������" � ������� "���������� ��������� ��������" � UAH
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceStandUdp(driver);
											
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
		
		//��������� ���������
		if (priceUahStanUdp.equals(tarifPage.labelStandPriceUah.getText()))
			System.out.println("Rate Eighth test is pass");
			else
				System.out.println("Rate Eighth test is false");
		
		//��������� ����
		driver.quit();
		
	}

}

package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateSixth extends Variables {
	@Test
	public void test() throws InterruptedException{
		//6-�������� ����� ���� ������ "�����������" � ������� "������� �������" � UAH
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceStandPv(driver);
											
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
		
		//��������� ���������
		if (priceUahStandPv.equals(tarifPage.labelStandPriceUah.getText()))
			System.out.println("Rate Sixth test is pass");
			else
				System.out.println("Rate Sixth test is false");
														
		//��������� ����
		driver.quit();
		
	}

}

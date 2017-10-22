package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//3-�������� ����� ���� ������ "�����������" ������ ����� � $
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceStand(driver);
											
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
		
		//��������� ���������
		if (priceDolStand.equals(tarifPage.labelStandPriceUsd.getText()))
			System.out.println("Rate Third test is pass");
			else
				System.out.println("Rate Third test is false");
																		
		//��������� ����
		driver.quit();
	}

}

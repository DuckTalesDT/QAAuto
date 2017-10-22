package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateFifteenth extends Variables {
	@Test
	public void test() throws InterruptedException{
		//15-�������� ����� ���� ������ "������������" ������ ����� � $
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaxim(driver);
											
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
		
		//��������� ���������
		if (priceDolMaxim.equals(tarifPage.labelMaximPriceUsd.getText()))
			System.out.println("Rate Fifteenth test is pass");
			else
				System.out.println("Rate Fifteenth test is false");
														
		//��������� ����
		driver.quit();
	}

}

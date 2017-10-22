package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//1-�������� ����� ���� ������ "������������" � $
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entrancePers(driver);
											
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
		
		//��������� ���������
		if (priceDolPerson.equals(tarifPage.labelPersPriceUsd.getText()))
			System.out.println("Rate First test is pass");
			else
				System.out.println("Rate First test is false");
		
		//��������� ����
		driver.quit();
	}

}

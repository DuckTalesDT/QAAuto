package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateSecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//2-�������� ����� ���� ������ "������������" � UAH
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entrancePers(driver);
											
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
		
		//��������� ���������
		if (priceUahPerson.equals(tarifPage.labelPersPriceUah.getText()))
			System.out.println("Rate Second test is pass");
			else
				System.out.println("Rate Second test is false");
		
		//��������� ����
		driver.quit();
		
	}

}

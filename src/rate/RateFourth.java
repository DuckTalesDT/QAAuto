package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//4-�������� ����� ���� ������ "�����������" ������ ����� � UAH
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceStand(driver);
											
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
		
		//��������� ���������
		if (priceUahStand.equals(tarifPage.labelStandPriceUah.getText()))
			System.out.println("Rate Fourth test is pass");
			else
				System.out.println("Rate Fourth test is false");
														
		//��������� ����
		driver.quit();
	}

}

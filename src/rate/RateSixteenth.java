package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateSixteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//16-�������� ����� ���� ������ "������������" ������ ����� � UAH
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaxim(driver);
											
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
		
		//��������� ���������
		if (priceUahMaxim.equals(tarifPage.labelMaximPriceUah.getText()))
			System.out.println("Rate Sixteenth test is pass");
			else
				System.out.println("Rate Sixteenth test is false");
														
		//��������� ����
		driver.quit();
	
	}

}

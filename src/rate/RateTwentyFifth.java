package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateTwentyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//25-������������ ���������� � ������ � ������
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
											
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
				
		//��������� ���������
		if (infoConsultationRate.equals(tarifPage.labelMainPrompt.getText()))
			System.out.println("Rate Twenty-fifth test is pass");
			else
				System.out.println("Rate Twenty-fifth test is false");
								
		//��������� ����������� ����
		driver.quit();
	}

}

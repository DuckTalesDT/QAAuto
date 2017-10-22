package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateNinetieth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//90-������������ ��������������� ����� ��� ��� �������� ����� "C����������" ������ �����
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceStand(driver);
		
		//������� ������������� � ��
		tarifPage.deleteForChangeTarif(driver);
								
		//��������� �������/���������
		payPage.goOptionPay(driver);
						
		//��������� ���������
		if (lineTarifAll  == (payPage.countUslugaBeforeChange(driver)))
			if (lineUserStand.equals(payPage.labelUslugaFirstBeforeChange.getText()))
				if (lineCenterStand.equals(payPage.labelUslugaSecondBeforeChange.getText()))
					if (linePvYes.equals(payPage.labelUslugaThirdBeforeChange.getText()))
						if (lineUdpYes.equals(payPage.labelUslugaFourthBeforeChange.getText()))
							System.out.println("Rate Ninties test is pass");
							else
								System.out.println("Rate Ninties test part �5 is false");
						else
							System.out.println("Rate Ninties test part �4 is false");
					else
						System.out.println("Rate Ninties test part �3 is false");
				else
					System.out.println("Rate Ninties test part �2 is false");
			else
				System.out.println("Rate Ninties test part �1 is false");
		
		//��������� ����
		driver.quit();
	}
}

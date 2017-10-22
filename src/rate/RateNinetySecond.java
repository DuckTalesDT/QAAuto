package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateNinetySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//92-������������ ��������������� ����� ��� ��� �������� ����� "C����������" � ������� "���������� ��������� ��������"
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceStandUdp(driver);
		
		//������� ������������� � ��
		tarifPage.deleteForChangeTarif(driver);
								
		//��������� �������/���������
		payPage.goOptionPay(driver);
						
		//��������� ���������
		if (lineTarifAll  == (payPage.countUslugaBeforeChange(driver)))
			if (lineUserStand.equals(payPage.labelUslugaFirstBeforeChange.getText()))
				if (lineCenterStand.equals(payPage.labelUslugaSecondBeforeChange.getText()))
					if (linePvNo.equals(payPage.labelUslugaThirdBeforeChange.getText()))
						if (lineUdpYes.equals(payPage.labelUslugaFourthBeforeChange.getText()))
							System.out.println("Rate Ninty-second test is pass");
							else
								System.out.println("Rate Ninty-second test part �5 is false");
						else
							System.out.println("Rate Ninty-second test part �4 is false");
					else
						System.out.println("Rate Ninty-second test part �3 is false");
				else
					System.out.println("Rate Ninty-second test part �2 is false");
			else
				System.out.println("Rate Ninty-second test part �1 is false");
		
		//��������� ����
		driver.quit();
	}
}

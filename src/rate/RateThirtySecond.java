package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateThirtySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//32-������������ ��������������� ����� ��� ��������� ��������� ����� �� "C����������" � ������� "���������� ��������� ��������"
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaxim(driver);
		
		//������� ������������� � ��
		tarifPage.deleteForChangeTarif(driver);
				
		//������������� ����� ����������� c ���
		tarifPage.changeTarifStandUdp(driver);
						
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//��������� ���������
		if (lineTarifAll  == (payPage.countUslugaAfterChange(driver)))
			if (lineUserStand.equals(payPage.labelUslugaFirstAfterChange.getText()))
				if (lineCenterStand.equals(payPage.labelUslugaSecondAfterChange.getText()))
					if (linePvNo.equals(payPage.labelUslugaThirdAfterChange.getText()))
						if (lineUdpYes.equals(payPage.labelUslugaFourthAfterChange.getText()))
							System.out.println("Rate Thirty-second test is pass");
							else
								System.out.println("Rate Thirty-second test part �5 is false");
						else
							System.out.println("Rate Thirty-second test part �4 is false");
					else
						System.out.println("Rate Thirty-second test part �3 is false");
				else
					System.out.println("Rate Thirty-second test part �2 is false");
			else
				System.out.println("Rate Thirty-second test part �1 is false");
						
		//���������� ����� �� ������������
		tarifPage.changeTarifMaxim(driver);
		
		//��������� ����
		driver.quit();
	}

}

package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateNinetyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//93-������������ ��������������� ����� ��� ��� �������� ����� "�����������" ������ �����
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptim(driver);
		
		//������� ������������� � ��
		tarifPage.deleteForChangeTarif(driver);
								
		//��������� �������/���������
		payPage.goOptionPay(driver);
						
		//��������� ���������
		if (lineTarifAll  == (payPage.countUslugaBeforeChange(driver)))
			if (lineUserOptim.equals(payPage.labelUslugaFirstBeforeChange.getText()))
				if (lineCenterOptim.equals(payPage.labelUslugaSecondBeforeChange.getText()))
					if (linePvYes.equals(payPage.labelUslugaThirdBeforeChange.getText()))
						if (lineUdpYes.equals(payPage.labelUslugaFourthBeforeChange.getText()))
							System.out.println("Rate Ninty-third test is pass");
							else
								System.out.println("Rate Ninty-third test part �5 is false");
						else
							System.out.println("Rate Ninty-third test part �4 is false");
					else
						System.out.println("Rate Ninty-third test part �3 is false");
				else
					System.out.println("Rate Ninty-third test part �2 is false");
			else
				System.out.println("Rate Ninty-third test part �1 is false");
		
		//��������� ����
		driver.quit();
	}
}

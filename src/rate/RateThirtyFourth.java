package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateThirtyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//34-������������ ��������������� ����� ��� ��������� ��������� ����� �� "�����������"  � ������� "������� �������"
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaxim(driver);
		
		//������� ������������� � ��
		tarifPage.deleteForChangeTarif(driver);
				
		//������������� ����� ����������� c ��
		tarifPage.changeTarifOptimPv(driver);
						
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//��������� ���������
		if (lineTarifAll  == (payPage.countUslugaAfterChange(driver)))
			if (lineUserOptim.equals(payPage.labelUslugaFirstAfterChange.getText()))
				if (lineCenterOptim.equals(payPage.labelUslugaSecondAfterChange.getText()))
					if (linePvYes.equals(payPage.labelUslugaThirdAfterChange.getText()))
						if (lineUdpNo.equals(payPage.labelUslugaFourthAfterChange.getText()))
							System.out.println("Rate Thirty-fourth test is pass");
							else
								System.out.println("Rate Thirty-fourth test part �5 is false");
						else
							System.out.println("Rate Thirty-fourth test part �4 is false");
					else
						System.out.println("Rate Thirty-fourth test part �3 is false");
				else
					System.out.println("Rate Thirty-fourth test part �2 is false");
			else
				System.out.println("Rate Thirty-fourth test part �1 is false");
						
		//���������� ����� �� ������������
		tarifPage.changeTarifMaxim(driver);
		
		//��������� ����
		driver.quit();
	}

}

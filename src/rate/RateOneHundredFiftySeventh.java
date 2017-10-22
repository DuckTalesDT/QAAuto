package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateOneHundredFiftySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//157-��� ����������� �� ��������� �������� "������� �������" ��� "���" ��� �������� ����������� �����
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaximPv(driver);
		
		//������� ������������� � ��
		tarifPage.deleteForChangeTarif(driver);
		
		//��������� �� ����� ������������ 
		tarifPage.changeTarifMaxim(driver);	
		
		//��������� �������/���������
		payPage.goOptionPay(driver);
		
		//��������� ���������
		if (linePvYes.equals(payPage.labelUslugaThirdBeforeChange.getText()))
			if (lineUdpYes.equals(payPage.labelUslugaFourthBeforeChange.getText()))
				System.out.println("Rate One hundred fifty-seventh test is pass");
				else
					System.out.println("Rate One hundred fifty-seventh test part �2 is false");
			else
				System.out.println("Rate One hundred fifty-seventh test part �1 is false");
		
		//������ ����� �� ������������ c ��
		tarifPage.changeTarifMaximPv(driver);	
																									
		//��������� ����
		driver.quit();
	}
}

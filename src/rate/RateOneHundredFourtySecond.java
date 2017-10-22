package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateOneHundredFourtySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//142-��������� ��������� ����� �� "�����������" � ������� "���������� ��������� ��������"
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaxim(driver);
		
		//������� ������������� � ��
		tarifPage.deleteForChangeTarif(driver);
		
		//��������� �� ����� ����������� � ���
		tarifPage.changeTarifStandUdp(driver);	
		
		//��������� �������/���������
		payPage.goOptionPay(driver);
		
		//��������� ���������
		if (textStand.equals(payPage.labelNameTarifAfterChange.getText()))
			if (linePvNo.equals(payPage.labelUslugaThirdAfterChange.getText()))
				if (lineUdpYes.equals(payPage.labelUslugaFourthAfterChange.getText()))
					System.out.println("Rate One hundred forty-second test is pass");
					else
						System.out.println("Rate One hundred forty-second test part �3 is false");
				else
					System.out.println("Rate One hundred forty-second test part �2 is false");
			else
				System.out.println("Rate One hundred forty-second test part �1 is false");
		
		//������ ����� �� ������������
		tarifPage.changeTarifMaxim(driver);	
																									
		//��������� ����
		driver.quit();
		
	}

}

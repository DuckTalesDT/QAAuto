package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateOneHundredFourtyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//144-��������� ��������� ����� �� "�����������" � ������� "������� �������"
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaxim(driver);
		
		//������� ������������� � ��
		tarifPage.deleteForChangeTarif(driver);
		
		//��������� �� ����� ����������� c ��
		tarifPage.changeTarifOptimPv(driver);	
		
		//��������� �������/���������
		payPage.goOptionPay(driver);
		
		//��������� ���������
		if (textOptim.equals(payPage.labelNameTarifAfterChange.getText()))
			if (linePvYes.equals(payPage.labelUslugaThirdAfterChange.getText()))
				if (lineUdpNo.equals(payPage.labelUslugaFourthAfterChange.getText()))
					System.out.println("Rate One hundred forty-fourth test is pass");
					else
						System.out.println("Rate One hundred forty-fourth test part �3 is false");
				else
					System.out.println("Rate One hundred forty-fourth test part �2 is false");
			else
				System.out.println("Rate One hundred forty-fourth test part �1 is false");
		
		//������ ����� �� ������������
		tarifPage.changeTarifMaxim(driver);	
																									
		//��������� ����
		driver.quit();
		
	}

}

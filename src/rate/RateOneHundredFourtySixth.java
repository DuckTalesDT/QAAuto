package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateOneHundredFourtySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//146-��������� ��������� ����� �� "������������"
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptim(driver);
		
		//������� ������������� � ��
		tarifPage.deleteForChangeTarif(driver);
		
		//��������� �� ����� ������������
		tarifPage.changeTarifMaxim(driver);	
		
		//��������� �������/���������
		payPage.goOptionPay(driver);
		
		//��������� ���������
		if (textMaxim.equals(payPage.labelNameTarifAfterChange.getText()))
			if (linePvYes.equals(payPage.labelUslugaThirdAfterChange.getText()))
				if (lineUdpYes.equals(payPage.labelUslugaFourthAfterChange.getText()))
					System.out.println("Rate One hundred forty-sixth test is pass");
					else
						System.out.println("Rate One hundred forty-sixth test part �3 is false");
				else
					System.out.println("Rate One hundred forty-sixth test part �2 is false");
			else
				System.out.println("Rate One hundred forty-sixth test part �1 is false");
		
		//������ ����� �� �����������
		tarifPage.changeTarifOptim(driver);	
																									
		//��������� ����
		driver.quit();
		
	}

}

package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateOneHundredFourtieth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//140-��������� ��������� ����� �� "�����������"
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaxim(driver);
		
		//������� ������������� � ��
		tarifPage.deleteForChangeTarif(driver);
		
		//��������� �� ����� �����������
		tarifPage.changeTarifStand(driver);	
		
		//��������� �������/���������
		payPage.goOptionPay(driver);
		
		//��������� ���������
		if (textStand.equals(payPage.labelNameTarifAfterChange.getText()))
			if (linePvYes.equals(payPage.labelUslugaThirdAfterChange.getText()))
				if (lineUdpYes.equals(payPage.labelUslugaFourthAfterChange.getText()))
					System.out.println("Rate One hundred fortieth test is pass");
					else
						System.out.println("Rate One hundred fortieth test part �3 is false");
				else
					System.out.println("Rate One hundred fortieth test part �2 is false");
			else
				System.out.println("Rate One hundred fortieth test part �1 is false");
		
		//������ ����� �� ������������
		tarifPage.changeTarifMaxim(driver);	
																									
		//��������� ����
		driver.quit();
		
	}

}

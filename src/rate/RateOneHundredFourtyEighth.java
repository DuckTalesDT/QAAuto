package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateOneHundredFourtyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//148-��������� ��������� ����� �� "������������" � ������� "���������� ��������� ��������"
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaxim(driver);
		
		//������� ������������� � ��
		tarifPage.deleteForChangeTarif(driver);
		
		//��������� �� ����� ������������ c ���
		tarifPage.changeTarifMaximUdp(driver);	
		
		//��������� �������/���������
		payPage.goOptionPay(driver);
		
		//��������� ���������
		if (textMaxim.equals(payPage.labelNameTarifAfterChange.getText()))
			if (linePvNo.equals(payPage.labelUslugaThirdAfterChange.getText()))
				if (lineUdpYes.equals(payPage.labelUslugaFourthAfterChange.getText()))
					System.out.println("Rate One hundred forty-eighth test is pass");
					else
						System.out.println("Rate One hundred forty-eighth test part �3 is false");
				else
					System.out.println("Rate One hundred forty-eighth test part �2 is false");
			else
				System.out.println("Rate One hundred forty-eighth test part �1 is false");
		
		//������ ����� �� ������������
		tarifPage.changeTarifMaxim(driver);	
																									
		//��������� ����
		driver.quit();
		
	}

}

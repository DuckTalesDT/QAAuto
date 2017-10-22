package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateEightyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//84-������������ ���� ��������� ��������� ����� "������������" � ������� "���������� ��������� ��������" �� 30 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaximUdp(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 30 ����
		payPage.setDays_30(driver);
					
		//��������� ���������
		if (pricePopMaximUdp_30.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Eighty-fourth test is pass");
			else
				System.out.println("Rate Eighty-fourth test is false");
								
		//��������� ����
		driver.quit();
	}

}

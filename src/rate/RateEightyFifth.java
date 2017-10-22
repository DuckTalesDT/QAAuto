package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateEightyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//85-������������ ���� ��������� ��������� ����� "������������" � ������� "���������� ��������� ��������" �� 60 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaximUdp(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 60 ����
		payPage.setDays_60(driver);
					
		//��������� ���������
		if (pricePopMaximUdp_60.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Eighty-fifth test is pass");
			else
				System.out.println("Rate Eighty-fifth test is false");
								
		//��������� ����
		driver.quit();
	}

}

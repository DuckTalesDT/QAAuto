package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateSeventyNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//79-������������ ���� ��������� ��������� ����� "������������" � ������� "������� �������" �� 30 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaximPv(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 30 ����
		payPage.setDays_30(driver);
					
		//��������� ���������
		if (pricePopMaximPv_30.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Seventy-ninth test is pass");
			else
				System.out.println("Rate Seventy-ninth test is false");
								
		//��������� ����
		driver.quit();
	}

}

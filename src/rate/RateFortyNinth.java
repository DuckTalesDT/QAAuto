package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFortyNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//49-������������ ���� ��������� ��������� ����� "�����������" � ������� "������� �������" �� 30 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceStandPv(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 30 ����
		payPage.setDays_30(driver);
					
		//��������� ���������
		if (pricePopStandPv_30.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Forty-ninth test is pass");
			else
				System.out.println("Rate Forty-ninth test is false");
						
		//��������� ����
		driver.quit();
	}

}

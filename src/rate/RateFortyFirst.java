package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFortyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//41-������������ ���� ��������� ��������� ����� "������������" �� 90 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entrancePers(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 90 ����
		payPage.setDays_90(driver);
					
		//��������� ���������
		if (pricePopPerson_90.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Forty-first test is pass");
			else
				System.out.println("Rate Forty-first test is false");
						
		//��������� ����
		driver.quit();
	}

}

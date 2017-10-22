package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFortyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//43-������������ ���� ��������� ��������� ����� "������������" �� 360 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entrancePers(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 360 ����
		payPage.setDays_360(driver);
					
		//��������� ���������
		if (pricePopPerson_360.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Forty-third test is pass");
			else
				System.out.println("Rate Forty-third test is false");
						
		//��������� ����
		driver.quit();
	}

}

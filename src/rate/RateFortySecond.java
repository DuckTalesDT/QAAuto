package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFortySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//42-������������ ���� ��������� ��������� ����� "������������" �� 180 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entrancePers(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 180 ����
		payPage.setDays_180(driver);
					
		//��������� ���������
		if (pricePopPerson_180.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Forty-second test is pass");
			else
				System.out.println("Rate Forty-second test is false");
						
		//��������� ����
		driver.quit();
	}

}

package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateThirtyNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//39-������������ ���� ��������� ��������� ����� "������������" �� 30 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entrancePers(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 30 ����
		payPage.setDays_30(driver);
					
		//��������� ���������
		if (pricePopPerson_30.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Thirty-ninth test is pass");
			else
				System.out.println("Rate Thirty-ninth test is false");
						
		//��������� ����
		driver.quit();
	}

}

package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFortieth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//40-������������ ���� ��������� ��������� ����� "������������" �� 60 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entrancePers(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 60 ����
		payPage.setDays_60(driver);
					
		//��������� ���������
		if (pricePopPerson_60.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Fortieth test is pass");
			else
				System.out.println("Rate Fortieth test is false");
						
		//��������� ����
		driver.quit();
					
	}
}



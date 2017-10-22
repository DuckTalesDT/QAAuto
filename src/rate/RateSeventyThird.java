package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateSeventyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//73-������������ ���� ��������� ��������� ����� "�����������" � ������� "���������� ��������� ��������" �� 360 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptimUdp(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 360 ����
		payPage.setDays_360(driver);
					
		//��������� ���������
		if (pricePopOptimUdp_360.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Seventy-third test is pass");
			else
				System.out.println("Rate Seventy-third test is false");
								
		//��������� ����
		driver.quit();
	}

}

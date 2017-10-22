package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateSeventyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//71-������������ ���� ��������� ��������� ����� "�����������" � ������� "���������� ��������� ��������" �� 90 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptimUdp(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 90 ����
		payPage.setDays_90(driver);
					
		//��������� ���������
		if (pricePopOptimUdp_90.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Seventy-first test is pass");
			else
				System.out.println("Rate Seventy-first test is false");
								
		//��������� ����
		driver.quit();
	}

}

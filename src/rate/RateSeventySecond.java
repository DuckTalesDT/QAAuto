package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateSeventySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//72-������������ ���� ��������� ��������� ����� "�����������" � ������� "���������� ��������� ��������" �� 180 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptimUdp(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 180 ����
		payPage.setDays_180(driver);
					
		//��������� ���������
		if (pricePopOptimUdp_180.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Seventy-second test is pass");
			else
				System.out.println("Rate Seventy-second test is false");
								
		//��������� ����
		driver.quit();
	}

}

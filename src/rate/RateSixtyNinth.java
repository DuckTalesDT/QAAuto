package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateSixtyNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//69-������������ ���� ��������� ��������� ����� "�����������" � ������� "���������� ��������� ��������" �� 30 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptimUdp(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 30 ����
		payPage.setDays_30(driver);
					
		//��������� ���������
		if (pricePopOptimUdp_30.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Sixty-ninth test is pass");
			else
				System.out.println("Rate Sixty-ninth test is false");
						
		//��������� ����
		driver.quit();
	}

}

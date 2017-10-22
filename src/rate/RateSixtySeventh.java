package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateSixtySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//67-������������ ���� ��������� ��������� ����� "�����������" � ������� "������� �������" �� 180 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptimPv(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 180 ����
		payPage.setDays_180(driver);
					
		//��������� ���������
		if (pricePopOptimPv_180.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Sixty-seventh test is pass");
			else
				System.out.println("Rate Sixty-seventh test is false");
						
		//��������� ����
		driver.quit();
	}

}

package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateSixtySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//66-������������ ���� ��������� ��������� ����� "�����������" � ������� "������� �������" �� 90 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptimPv(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 90 ����
		payPage.setDays_90(driver);
					
		//��������� ���������
		if (pricePopOptimPv_90.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Sixty-sixth test is pass");
			else
				System.out.println("Rate Sixty-sixth test is false");
						
		//��������� ����
		driver.quit();
	}

}

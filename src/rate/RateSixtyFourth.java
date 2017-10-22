package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateSixtyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//64-������������ ���� ��������� ��������� ����� "�����������" � ������� "������� �������" �� 30 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptimPv(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 30 ����
		payPage.setDays_30(driver);
					
		//��������� ���������
		if (pricePopOptimPv_30.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Sixty-fourth test is pass");
			else
				System.out.println("Rate Sixty-fourth test is false");
						
		//��������� ����
		driver.quit();
	}

}

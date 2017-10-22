package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateSixtyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//65-������������ ���� ��������� ��������� ����� "�����������" � ������� "������� �������" �� 60 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptimPv(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 60 ����
		payPage.setDays_60(driver);
					
		//��������� ���������
		if (pricePopOptimPv_60.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Sixty-fifth test is pass");
			else
				System.out.println("Rate Sixty-fifth test is false");
						
		//��������� ����
		driver.quit();
	}

}

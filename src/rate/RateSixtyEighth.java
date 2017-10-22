package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateSixtyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//68-������������ ���� ��������� ��������� ����� "�����������" � ������� "������� �������" �� 360 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptimPv(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 360 ����
		payPage.setDays_360(driver);
					
		//��������� ���������
		if (pricePopOptimPv_360.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Sixty-eighth test is pass");
			else
				System.out.println("Rate Sixty-eighth test is false");
						
		//��������� ����
		driver.quit();
	}

}

package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateSixtyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//63-������������ ���� ��������� ��������� ����� "�����������" ������ ����� �� 360 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptim(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 360 ����
		payPage.setDays_360(driver);
					
		//��������� ���������
		if (pricePopOptim_360.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Sixty-third test is pass");
			else
				System.out.println("Rate Sixty-third test is false");
						
		//��������� ����
		driver.quit();
	}

}

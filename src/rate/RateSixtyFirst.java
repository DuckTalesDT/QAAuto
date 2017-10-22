package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateSixtyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//61-������������ ���� ��������� ��������� ����� "�����������" ������ ����� �� 90 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptim(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 90 ����
		payPage.setDays_90(driver);
					
		//��������� ���������
		if (pricePopOptim_90.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Sixty-first test is pass");
			else
				System.out.println("Rate Sixty-first test is false");
						
		//��������� ����
		driver.quit();
	}

}

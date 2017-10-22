package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateSixtySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//62-������������ ���� ��������� ��������� ����� "�����������" ������ ����� �� 180 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptim(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 180 ����
		payPage.setDays_180(driver);
					
		//��������� ���������
		if (pricePopOptim_180.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Sixty-second test is pass");
			else
				System.out.println("Rate Sixty-second test is false");
						
		//��������� ����
		driver.quit();
	}

}

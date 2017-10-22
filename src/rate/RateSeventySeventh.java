package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateSeventySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//77-������������ ���� ��������� ��������� ����� "������������" ������ ����� �� 180 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaxim(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 180 ����
		payPage.setDays_180(driver);
					
		//��������� ���������
		if (pricePopMaxim_180.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Seventy-seventh test is pass");
			else
				System.out.println("Rate Seventy-seventh test is false");
								
		//��������� ����
		driver.quit();
	}

}

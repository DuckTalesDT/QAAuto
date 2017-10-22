package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFortySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//47-������������ ���� ��������� ��������� ����� "�����������" ������ ����� �� 180 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceStand(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 180 ����
		payPage.setDays_180(driver);
					
		//��������� ���������
		if (pricePopStand_180.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Forty-seventh test is pass");
			else
				System.out.println("Rate Forty-seventh test is false");
						
		//��������� ����
		driver.quit();
	}

}

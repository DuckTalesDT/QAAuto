package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFiftyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//53-������������ ���� ��������� ��������� ����� "�����������" � ������� "������� �������" �� 360 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceStandPv(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 360 ����
		payPage.setDays_360(driver);
					
		//��������� ���������
		if (pricePopStandPv_360.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Fifty-third test is pass");
			else
				System.out.println("Rate Fifty-third test is false");
						
		//��������� ����
		driver.quit();
	}

}

package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFiftySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//52-������������ ���� ��������� ��������� ����� "�����������" � ������� "������� �������" �� 180 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceStandPv(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 180 ����
		payPage.setDays_180(driver);
					
		//��������� ���������
		if (pricePopStandPv_180.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Fifty-second test is pass");
			else
				System.out.println("Rate Fifty-second test is false");
						
		//��������� ����
		driver.quit();
	}

}

package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFiftyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//51-������������ ���� ��������� ��������� ����� "�����������" � ������� "������� �������" �� 90 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceStandPv(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 90 ����
		payPage.setDays_90(driver);
					
		//��������� ���������
		if (pricePopStandPv_90.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Fifty-first test is pass");
			else
				System.out.println("Rate Fifty-first test is false");
						
		//��������� ����
		driver.quit();
	}

}

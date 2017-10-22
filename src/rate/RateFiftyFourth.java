package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFiftyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//54-������������ ���� ��������� ��������� ����� "�����������" � ������� "���������� ��������� ��������" �� 30 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceStandUdp(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 30 ����
		payPage.setDays_30(driver);
					
		//��������� ���������
		if (pricePopStandUdp_30.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Fifty-fourth test is pass");
			else
				System.out.println("Rate Fifty-fourth test is false");
						
		//��������� ����
		driver.quit();
	}

}

package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateSeventies extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//70-������������ ���� ��������� ��������� ����� "�����������" � ������� "���������� ��������� ��������" �� 60 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptimUdp(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 60 ����
		payPage.setDays_60(driver);
					
		//��������� ���������
		if (pricePopOptimUdp_60.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Seventies test is pass");
			else
				System.out.println("Rate Seventies test is false");
						
		//��������� ����
		driver.quit();
	}

}

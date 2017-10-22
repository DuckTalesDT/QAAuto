package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateEightySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//87-������������ ���� ��������� ��������� ����� "������������" � ������� "���������� ��������� ��������" �� 180 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaximUdp(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 180 ����
		payPage.setDays_180(driver);
					
		//��������� ���������
		if (pricePopMaximUdp_180.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Eighty-seventh test is pass");
			else
				System.out.println("Rate Eighty-seventh test is false");
								
		//��������� ����
		driver.quit();
	}

}

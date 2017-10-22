package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateEightyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//88-������������ ���� ��������� ��������� ����� "������������" � ������� "���������� ��������� ��������" �� 360 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaximUdp(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 360 ����
		payPage.setDays_360(driver);
					
		//��������� ���������
		if (pricePopMaximUdp_360.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Eighty-eighth test is pass");
			else
				System.out.println("Rate Eighty-eighth test is false");
								
		//��������� ����
		driver.quit();
	}

}

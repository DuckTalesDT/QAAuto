package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateEightyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//83-������������ ���� ��������� ��������� ����� "������������" � ������� "������� �������" �� 360 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaximPv(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 360 ����
		payPage.setDays_360(driver);
					
		//��������� ���������
		if (pricePopMaximPv_360.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Eighty-third test is pass");
			else
				System.out.println("Rate Eighty-third test is false");
								
		//��������� ����
		driver.quit();
	}

}

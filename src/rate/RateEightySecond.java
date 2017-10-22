package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateEightySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//82-������������ ���� ��������� ��������� ����� "������������" � ������� "������� �������" �� 180 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaximPv(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 180 ����
		payPage.setDays_180(driver);
					
		//��������� ���������
		if (pricePopMaximPv_180.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Eighty-second test is pass");
			else
				System.out.println("Rate Eighty-second test is false");
								
		//��������� ����
		driver.quit();
	}

}

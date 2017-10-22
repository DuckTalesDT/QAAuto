package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateEightyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//81-������������ ���� ��������� ��������� ����� "������������" � ������� "������� �������" �� 90 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaximPv(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 90 ����
		payPage.setDays_90(driver);
					
		//��������� ���������
		if (pricePopMaximPv_90.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Eighty-first test is pass");
			else
				System.out.println("Rate Eighty-first test is false");
								
		//��������� ����
		driver.quit();
	}

}

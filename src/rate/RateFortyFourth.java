package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFortyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//44-������������ ���� ��������� ��������� ����� "�����������" ������ ����� �� 30 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceStand(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 30 ����
		payPage.setDays_30(driver);
					
		//��������� ���������
		if (pricePopStand_30.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Forty-fourth test is pass");
			else
				System.out.println("Rate Forty-fourth test is false");
						
		//��������� ����
		driver.quit();
	}

}

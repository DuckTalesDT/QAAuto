package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFortyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//45-������������ ���� ��������� ��������� ����� "�����������" ������ ����� �� 60 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceStand(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 60 ����
		payPage.setDays_60(driver);
					
		//��������� ���������
		if (pricePopStand_60.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Forty-fifth test is pass");
			else
				System.out.println("Rate Forty-fifth test is false");
						
		//��������� ����
		driver.quit();
	}

}

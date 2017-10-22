package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFortySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//46-������������ ���� ��������� ��������� ����� "�����������" ������ ����� �� 90 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceStand(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 90 ����
		payPage.setDays_90(driver);
					
		//��������� ���������
		if (pricePopStand_90.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Forty-sixth test is pass");
			else
				System.out.println("Rate Forty-sixth test is false");
						
		//��������� ����
		driver.quit();
	}

}

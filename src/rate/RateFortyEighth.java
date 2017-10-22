package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFortyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//48-������������ ���� ��������� ��������� ����� "�����������" ������ ����� �� 360 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceStand(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 360 ����
		payPage.setDays_360(driver);
					
		//��������� ���������
		if (pricePopStand_360.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Forty-eighth test is pass");
			else
				System.out.println("Rate Forty-eighth test is false");
						
		//��������� ����
		driver.quit();
	}

}

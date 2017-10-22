package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFifties extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//50-������������ ���� ��������� ��������� ����� "�����������" � ������� "������� �������" �� 60 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceStandPv(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 60 ����
		payPage.setDays_60(driver);
					
		//��������� ���������
		if (pricePopStandPv_60.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Fifties test is pass");
			else
				System.out.println("Rate Fifties test is false");
						
		//��������� ����
		driver.quit();
	}

}

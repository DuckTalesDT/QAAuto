package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateEighties extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//80-������������ ���� ��������� ��������� ����� "������������" � ������� "������� �������" �� 60 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaximPv(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 60 ����
		payPage.setDays_60(driver);
					
		//��������� ���������
		if (pricePopMaximPv_60.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Eighties test is pass");
			else
				System.out.println("Rate Eighties test is false");
								
		//��������� ����
		driver.quit();
	}

}

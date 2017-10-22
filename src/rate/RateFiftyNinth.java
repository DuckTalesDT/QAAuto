package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFiftyNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//59-������������ ���� ��������� ��������� ����� "�����������" ������ ����� �� 30 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptim(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 30 ����
		payPage.setDays_30(driver);
					
		//��������� ���������
		if (pricePopOptim_30.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Fifty-ninth test is pass");
			else
				System.out.println("Rate Fifty-ninth test is false");
						
		//��������� ����
		driver.quit();
	}

}

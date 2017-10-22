package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFiftyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//58-������������ ���� ��������� ��������� ����� "�����������" � ������� "���������� ��������� ��������" �� 360 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceStandUdp(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 360 ����
		payPage.setDays_360(driver);
					
		//��������� ���������
		if (pricePopStandUdp_360.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Fifty-eighth test is pass");
			else
				System.out.println("Rate Fifty-eighth test is false");
						
		//��������� ����
		driver.quit();
	}

}

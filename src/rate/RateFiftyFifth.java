package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFiftyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//55-������������ ���� ��������� ��������� ����� "�����������" � ������� "���������� ��������� ��������" �� 60 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceStandUdp(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 60 ����
		payPage.setDays_60(driver);
					
		//��������� ���������
		if (pricePopStandUdp_60.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Fifty-fifth test is pass");
			else
				System.out.println("Rate Fifty-fifth test is false");
						
		//��������� ����
		driver.quit();
	}

}

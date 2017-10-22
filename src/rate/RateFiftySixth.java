package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateFiftySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//56-������������ ���� ��������� ��������� ����� "�����������" � ������� "���������� ��������� ��������" �� 90 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceStandUdp(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 90 ����
		payPage.setDays_90(driver);
					
		//��������� ���������
		if (pricePopStandUdp_90.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Fifty-sixth test is pass");
			else
				System.out.println("Rate Fifty-sixth test is false");
						
		//��������� ����
		driver.quit();
	}

}

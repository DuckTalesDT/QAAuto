package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateSeventySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//76-������������ ���� ��������� ��������� ����� "������������" ������ ����� �� 90 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaxim(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 90 ����
		payPage.setDays_90(driver);
					
		//��������� ���������
		if (pricePopMaxim_90.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Seventy-sixth test is pass");
			else
				System.out.println("Rate Seventy-sixth test is false");
								
		//��������� ����
		driver.quit();
	}

}

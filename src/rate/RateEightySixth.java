package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateEightySixth extends Variables {

	@Test
	public void test() throws InterruptedException{
		//86-������������ ���� ��������� ��������� ����� "������������" � ������� "���������� ��������� ��������" �� 90 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaximUdp(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 90 ����
		payPage.setDays_90(driver);
					
		//��������� ���������
		if (pricePopMaximUdp_90.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Eighty-sixth test is pass");
			else
				System.out.println("Rate Eighty-sixth test is false");
								
		//��������� ����
		driver.quit();
	}

}

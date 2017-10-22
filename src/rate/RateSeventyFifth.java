package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateSeventyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//75-������������ ���� ��������� ��������� ����� "������������" ������ ����� �� 60 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaxim(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 60 ����
		payPage.setDays_60(driver);
					
		//��������� ���������
		if (pricePopMaxim_60.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Seventy-fifth test is pass");
			else
				System.out.println("Rate Seventy-fifth test is false");
								
		//��������� ����
		driver.quit();
	}

}

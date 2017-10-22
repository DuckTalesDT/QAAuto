package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateSeventyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//78-������������ ���� ��������� ��������� ����� "������������" ������ ����� �� 360 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaxim(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 360 ����
		payPage.setDays_360(driver);
					
		//��������� ���������
		if (pricePopMaxim_360.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Seventy-eighth test is pass");
			else
				System.out.println("Rate Seventy-eighth test is false");
								
		//��������� ����
		driver.quit();
	}

}

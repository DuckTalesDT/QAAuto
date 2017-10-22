package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateSeventyFourth extends Variables  {
	
	@Test
	public void test() throws InterruptedException{
		//74-������������ ���� ��������� ��������� ����� "������������" ������ ����� �� 30 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaxim(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 30 ����
		payPage.setDays_30(driver);
					
		//��������� ���������
		if (pricePopMaxim_30.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Seventy-fourth test is pass");
			else
				System.out.println("Rate Seventy-fourth test is false");
								
		//��������� ����
		driver.quit();
	}

}

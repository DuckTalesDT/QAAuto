package rate;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.Variables;

public class RateSixtieth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//60-������������ ���� ��������� ��������� ����� "�����������" ������ ����� �� 60 ����
		EntrancePage entrancePage = new EntrancePage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptim(driver);
																		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//������������� ����� ������ 60 ����
		payPage.setDays_60(driver);
					
		//��������� ���������
		if (pricePopOptim_60.equals(payPage.labelPaySumma.getText()))
			System.out.println("Rate Sixtieth test is pass");
			else
				System.out.println("Rate Sixtieth test is false");
						
		//��������� ����
		driver.quit();
	}

}

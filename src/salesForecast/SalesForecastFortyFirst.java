package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastFortyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//41-����������� ������ ��������
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
		
		//������� 3 ��
		for (int i = 0; i <=2; i ++){
			centersPage.addCenterThisMonth(driver);
			}
		
		//�������� "������� �������"
		pvPage.optionPv(driver);
		
		//�������� ���������� ���� � ������
		int days = pvPage.countDays(driver);
				
		//������� �������� ��� ����������
		String data = "0";
		if (days == 28)
			data = data_84000;
			else if (days == 29)
				data = data_87000;
				else if (days == 30)
					data = data_90000;
					else if (days == 31)
						data = data_93000;
					
		//������ ����� �� �� �1
		pvPage.fieldCenterFirst.click();
		Thread.sleep(3000);
		pvPage.setPrognoz(driver);
		
		//������ ����� �� �� �2
		pvPage.fieldCenterSecond.click();
		Thread.sleep(3000);
		pvPage.setPrognoz(driver);
				
		//������ ����� �� �� �3
		pvPage.fieldCenterThird.click();
		Thread.sleep(3000);
		pvPage.setPrognoz(driver);
					
		//���������� "����� �������"
		pvPage.buttonTotalPrognoz.click();
		Thread.sleep(1000);
		
		//��������� ���������
		if (data.equals(pvPage.fieldPrognozTotal.getText()))
			System.out.println("SalesForecast Forty-first test is pass");
			else
				System.out.println("SalesForecast Forty-first test is false");
		
		//��-���������� "����� �������"
		pvPage.buttonTotalPrognoz.click();
		Thread.sleep(1000);
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}

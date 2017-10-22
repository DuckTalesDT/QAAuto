package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastThirtyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//31-����������� �������� � ������� �������
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
		
		//�������� "������� �������"
		pvPage.optionPv(driver);
						
		//������� �� �� ������� �����
		pvPage.addCenterThisMonth(driver);
						
		//�������� "������� �������"
		pvPage.optionPv(driver);
		
		//�������� ���������� ���� � ������
		int days = pvPage.countDays(driver);
				
		//������� �������� ��� ����������
		String data = "0";
		if (days == 28)
			data = data_28000;
			else if (days == 29)
				data = data_29000;
				else if (days == 30)
					data = data_30000;
					else if (days == 31)
						data = data_31000;
				
		//������ �������
		pvPage.setPrognoz(driver);
		
		//��������� ���������
		if (data.equals(pvPage.fieldPrognoz_1.getText()))
			System.out.println("SalesForecast Thirty-first test is pass");
			else
				System.out.println("SalesForecast Thirty-first test is false");
				
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}

}

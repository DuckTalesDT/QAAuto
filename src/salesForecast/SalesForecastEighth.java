package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//8-����� ����� � ������������ ��������� ���������
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
				
		//������� 2 �� �� ������� �����
		pvPage.addCenterThisMonth(driver);
		pvPage.addCenterThisMonth(driver);
				
		//�������� "������� �������"
		pvPage.optionPv(driver);
		
		//��������� ���������
		if (countCenters_2 == (pvPage.countCenters(driver)))
			if (centerName.equals(pvPage.fieldCenterFirst.getText()))
				if (centerName.equals(pvPage.fieldCenterFirst.getText()))
					System.out.println("SalesForecast Eighth test is pass");
					else
						System.out.println("SalesForecast Eighth test part �3 is false");
				else
					System.out.println("SalesForecast Eighth test part �2 is false");
			else
				System.out.println("SalesForecast Eighth test part �1 is false");
			
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}

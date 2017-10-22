package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredEighteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//118-������� �� ������� ������ ���������� ��� ��������� ������ �����
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
		
		//������� 2 �� �� ������� � ��������� �������
		centersPage.addCenterThisMonth(driver);
		centersPage.addCenterBeforeMonth(driver);
						
		//��������� "������� �������"
		pvPage.optionPv(driver);
				
		//��������� "������� �� ������� ������"
		pvPage.buttonSalesPeriodOpen.click();
		Thread.sleep(1000);
		
		//������������� �������� ������� �����
		pvPage.buttonSalesPeriodCenters.click();
		
		//��������� ���������
		if (countCenters_2 == (pvPage.countSalesPeriodCountCenters(driver)))
			if (centerName.equals(pvPage.fieldSalesPeriodCenterFirst.getText()))
				if (centerName.equals(pvPage.fieldSalesPeriodCenterSecond.getText()))
					System.out.println("SalesForecast One hundred eighteenth test is pass");
					else
						System.out.println("SalesForecast One hundred eighteenth test part �3 is false");
				else
					System.out.println("SalesForecast One hundred eighteenth test part �2 is false");
			else
				System.out.println("SalesForecast One hundred eighteenth test part �1 is false");
		
		//��������� ����
		pvPage.buttonSalesPeriodClose.click();
				
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}

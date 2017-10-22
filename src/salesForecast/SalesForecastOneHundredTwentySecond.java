package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredTwentySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//122-������ � ������� �� ������� ������ ����� �������� ������ �����
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
		
		//������� ��
		centersPage.addCenterThisMonth(driver);
						
		//��������� "������� �������"
		pvPage.optionPv(driver);
				
		//��������� "������� �� ������� ������"
		pvPage.buttonSalesPeriodOpen.click();
		Thread.sleep(1000);
			
		//��������� ���������
		if (centerName.equals(pvPage.fieldSalesPeriodCenterName.getText()))
			System.out.println("SalesForecast One hundred twenty-second test is pass");
			else
				System.out.println("SalesForecast One hundred twenty-second test part �2 is false");
		
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

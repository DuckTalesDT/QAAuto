package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastTwentySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//27-�������� �������� � ������� ����
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
	
		//������ �������� � ����
		pvPage.inputPlanFirst_1000(driver);
				
		//��������� ���������
		if (dataCeloe_1000.equals(pvPage.fieldPlan_1.getAttribute("value")))
			System.out.println("SalesForecast Twenty-seventh test is pass");
			else
				System.out.println("SalesForecast Twenty-seventh test is false");
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}

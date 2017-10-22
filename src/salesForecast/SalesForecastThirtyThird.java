package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastThirtyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//33-������� ����� �� ��������� ������� �������� (����� �����)
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
			
		//������ �������� � 1-� ����
		pvPage.fieldKassa_1.sendKeys(empty_15);
		pvPage.fieldKassa_1.sendKeys(data_1000Bigger);
		
		//��������� ���������
		if (data_1000.equals(pvPage.fieldKassa_1.getAttribute("value")))
			System.out.println("SalesForecast Thirty-third test is pass");
			else
				System.out.println("SalesForecast Thirty-third test is false");
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}

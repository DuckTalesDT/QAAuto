package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastThirtyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//34-������� ����� �� ��������� ���� ������� ����� ����
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
		pvPage.fieldKassa_1.sendKeys(dataX);
		
		//��������� ���������
		if (dataEmpty.equals(pvPage.fieldKassa_1.getAttribute("value")))
			System.out.println("SalesForecast Thirty-fourth test is pass");
			else
				System.out.println("SalesForecast Thirty-fourth test is false");
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}

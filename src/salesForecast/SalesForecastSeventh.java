package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastSeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//7-������� � ������ "������ �����" ��� �������
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
			
		//�������� "�������� ����� �����"
		pvPage.buttonAddCenter.click();
			
		//�������� �������� ������ �����
		centersPage.fieldCenterName.sendKeys(centerName);
						
		//������� ���������� "�� ������� �����"
		if (centersPage.buttonBeforePeriod.isEnabled())
			centersPage.buttonBeforePeriod.click();
						
		//�������� "��������"
		centersPage.buttonCenterDontSave.click();
		Thread.sleep(1000);		
		
		//�������� "������� �������"
		if (countCenters_0 == (centersPage.countCenters(driver)))
			{
			//�������� "������� �������"
			pvPage.optionPv(driver);
			
			//��������� ���������
			if (countCenters_0 == (pvPage.countCenters(driver)))
				System.out.println("SalesForecast Seventh test is pass");
				else
					System.out.println("SalesForecast Seventh test part �2 is false");
			}
			else
				System.out.println("SalesForecast Seventh test part �1 is false");
				
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}

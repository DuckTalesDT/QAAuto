package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//4-�������� ������ ����� ��������� ��� ���� ��������
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
		centersPage.fieldCenterName.sendKeys(centerNameX);
						
		//������� ���������� "�� ������� �����"
		if (centersPage.buttonBeforePeriod.isEnabled())
			centersPage.buttonBeforePeriod.click();
						
		//�������� "���������"
		centersPage.buttonCenterSave.click();
		Thread.sleep(3000);		
											
		//�������� "������� �������"
		pvPage.optionPv(driver);
		
		//��������� ���������
		if (countCenters_1 == (pvPage.countCenters(driver)))
			if (centerNameX.equals(pvPage.fieldCenterFirst.getText()))
				System.out.println("SalesForecast Fourth test is pass");
				else
					System.out.println("SalesForecast Fourth test part �2 is false");
			else
				System.out.println("SalesForecast Fourth test part �1 is false");
				
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}

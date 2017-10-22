package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastEleventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//11-�������������� ������ �����
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
		
		//��������� ��
		pvPage.addCenterThisMonth(driver);
		
		//�������� "������� �������"
		pvPage.optionPv(driver);
						
		//��������� ��
		pvPage.buttonCenterEdit.click();
		
		//�������� ����� �������� ������ �����
		centersPage.fieldCenterName.sendKeys(empty_15);
		centersPage.fieldCenterName.sendKeys(centerNameNew);
						
		//�������� "���������"
		centersPage.buttonCenterSave.click();
		Thread.sleep(3000);
		
		//�������� "������� �������"
		pvPage.optionPv(driver);
		
		//��������� ���������
		if (countCenters_1 == (pvPage.countCenters(driver)))
			if (centerNameNew.equals(pvPage.fieldCenterFirst.getText()))
				System.out.println("SalesForecast Eleventh test is pass");
				else
					System.out.println("SalesForecast Eleventh test part �2 is false");
			else
				System.out.println("SalesForecast Eleventh test part �1 is false");
			
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}

package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//5-�������� ������ ����� �� ��������� ����� 30 ��������
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
		centersPage.fieldCenterName.sendKeys(centerNameBigger);
						
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
			if (centerNameSmaller.equals(pvPage.fieldCenterFirst.getText()))
				System.out.println("SalesForecast Fifth test is pass");
				else
					System.out.println("SalesForecast Fifth test part �2 is false");
			else
				System.out.println("SalesForecast Fifth test part �1 is false");
				
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}

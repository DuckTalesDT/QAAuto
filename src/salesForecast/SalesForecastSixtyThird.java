package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastSixtyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//63-������ ����� ����������� � ������� ��� ����������� � ������� "������ �����"
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
		
		//�������� "�������� ����� �����"
		centersPage.buttonAddCenter.click();
						
		//�������� �������� ������ �����
		centersPage.fieldCenterName.sendKeys(centerName);
						
		//������� ���������� "�� ������� �����"
		if (centersPage.buttonBeforePeriod.isEnabled())
			centersPage.buttonBeforePeriod.click();
				
		//�������� "���������"
		centersPage.buttonCenterSave.click();
		Thread.sleep(3000);		
		
		//�������� "�������� ����� �����"
		centersPage.buttonAddCenter.click();
								
		//�������� �������� ������ �����
		centersPage.fieldCenterName.sendKeys(centerNameSecond);
							
		//������� ���������� "�� ������� �����"
		if (centersPage.buttonBeforePeriod.isEnabled())
			centersPage.buttonBeforePeriod.click();
						
		//�������� "���������"
		centersPage.buttonCenterSave.click();
		Thread.sleep(3000);		
				
		//�������� "�������� ����� �����"
		centersPage.buttonAddCenter.click();
								
		//�������� �������� ������ �����
		centersPage.fieldCenterName.sendKeys(centerNameFirst);
								
		//������� ���������� "�� ������� �����"
		if (centersPage.buttonBeforePeriod.isEnabled())
			centersPage.buttonBeforePeriod.click();
						
		//�������� "���������"
		centersPage.buttonCenterSave.click();
		Thread.sleep(3000);		
		
		//�������� "������� �������"
		pvPage.optionPv(driver);
		
		//��������� ���������
		Thread.sleep(3000);
		if (centerNameFirst.equals(pvPage.fieldCenterFirst.getText()))
			if (centerNameSecond.equals(pvPage.fieldCenterSecond.getText()))
				if (centerName.equals(pvPage.fieldCenterThird.getText()))
					System.out.println("SalesForecast Sixty-third test is pass");
					else
						System.out.println("SalesForecast Sixty-third test part �3 is false");
				else
					System.out.println("SalesForecast Sixty-third test part �2 is false");
			else
				System.out.println("SalesForecast Sixty-third test part �1 is false");
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}

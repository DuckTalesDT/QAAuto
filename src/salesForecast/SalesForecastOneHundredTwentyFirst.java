package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredTwentyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//121-������ ����� � ������� �� ������� ������ ����������
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
		{
		//�������� "�������� ����� �����"
		centersPage.buttonAddCenter.click();
					
		//�������� �������� ������ �����
		centersPage.fieldCenterName.sendKeys(centerNameFirst);
						
		//������������� ���������� "�� ������� �����"
		if (!centersPage.buttonBeforePeriod.isEnabled())
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
		}
						
		//��������� "������� �������"
		pvPage.optionPv(driver);
				
		//��������� "������� �� ������� ������"
		pvPage.buttonSalesPeriodOpen.click();
		Thread.sleep(1000);
		
		//������������� �������� ������� �����
		pvPage.buttonSalesPeriodCenters.click();
		
		//�������� ����� ����� �1
		pvPage.fieldSalesPeriodCenterFirst.click();
		Thread.sleep(1000);
		
		//��������� ���������
		if (centerNameSecond.equals(pvPage.fieldSalesPeriodCenterName.getText()))
			{
			//������������� �������� ������� �����
			pvPage.buttonSalesPeriodCenters.click();
			
			//�������� ����� ����� �1
			pvPage.fieldSalesPeriodCenterSecond.click();
			Thread.sleep(1000);
			
			//���������
			if (centerNameFirst.equals(pvPage.fieldSalesPeriodCenterName.getText()))
				System.out.println("SalesForecast One hundred twenty-first test is pass");
				else
					System.out.println("SalesForecast One hundred twenty-first test part �2 is false");
			}
			else
				System.out.println("SalesForecast One hundred twenty-first test part �1 is false");
		
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

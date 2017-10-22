package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;


public class SalesForecastTwentyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//24-��������� �� ������� ������ ����� ����� ������������ ������� � �������� �������
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
		centersPage.fieldCenterName.sendKeys(centerNameMonth);
						
		//������� ���������� "�� ������� �����"
		if (centersPage.buttonBeforePeriod.isEnabled())
			centersPage.buttonBeforePeriod.click();
		
		//�������� "���������"
		centersPage.buttonCenterSave.click();
		Thread.sleep(3000);		
				
		//�������� "������� �������"
		pvPage.optionPv(driver);
		
		//��������� ���������
		//������� �����
		if (countCenters_1 == (pvPage.countCenters(driver)))
			if (centerNameMonth.equals(pvPage.fieldCenterFirst.getText()))
				{
				//��������� � ��������� �����
				pvPage.goAfterMonth(driver);
					
				//���������
				if (countCenters_1 == (pvPage.countCenters(driver)))
					if (centerNameMonth.equals(pvPage.fieldCenterFirst.getText()))
						{
						//��������� � ���������� ����� 
						pvPage.goBeforeMonth(driver);
						pvPage.goBeforeMonth(driver);
						
						//���������
						if (!centerNameMonth.equals(pvPage.fieldCenterFirst.getText()))
							System.out.println("SalesForecast Twenty-fourth test is pass");
							else
								System.out.println("SalesForecast Twenty-fourth test part �5 is false");
						}
						else
							System.out.println("SalesForecast Twenty-fourth test part �4 is false");
					else
						System.out.println("SalesForecast Twenty-fourth test part �3 is false");
				}
				else
					System.out.println("SalesForecast Twenty-fourth test part �2 is false");
			else
				System.out.println("SalesForecast Twenty-fourth test part �1 is false");
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
								
		//��������� ����
		driver.quit();
	}
}

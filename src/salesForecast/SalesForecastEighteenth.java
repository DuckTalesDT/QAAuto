package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastEighteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//18-����������� � ������ ����� ��������� ��������� �������
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
				
		//�������� �����������
		centersPage.fieldCenterComment.sendKeys(centerCommentX);
						
		//�������� "���������"
		centersPage.buttonCenterSave.click();
		Thread.sleep(3000);		
		
		//�������� "������� �������"
		pvPage.optionPv(driver);
				
		//��������� ���������
		if (countCenters_1 == (pvPage.countCenters(driver)))
			if (centerName.equals(pvPage.fieldCenterFirst.getText()))
				{
				//��������� ����� �����
				Thread.sleep(3000);
				pvPage.buttonCenterEdit.click();
				
				//��������� �����������
				if (centerCommentX.equals(centersPage.fieldCenterComment.getText()))
					System.out.println("SalesForecast Eighteenth test is pass");
					else
						System.out.println("SalesForecast Eighteenth test part �3 is false");
				}
				else
					System.out.println("SalesForecast Eighteenth test part �2 is false");
			else
				System.out.println("SalesForecast Eighteenth test part �1 is false");
			
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}
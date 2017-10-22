package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastTwelfth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//12-���������� ��������� ����� ����� � ��������� ���������
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
		
		//Elfkztv �������� ������ �����
		centersPage.fieldCenterName.sendKeys(empty_15);
								
		//�������� "���������"
		centersPage.buttonCenterSave.click();
		Thread.sleep(1000);
		
		//�������� "��������"
		centersPage.buttonCenterDontSave.click();
		Thread.sleep(1000);
		
		//�������� "������� �������"
		pvPage.optionPv(driver);
		
		//��������� ���������
		if (countCenters_1 == (pvPage.countCenters(driver)))
			if (centerName.equals(pvPage.fieldCenterFirst.getText()))
				System.out.println("SalesForecast Twelfth test is pass");
				else
					System.out.println("SalesForecast Twelfth test part �2 is false");
			else
				System.out.println("SalesForecast Twelfth test part �1 is false");
			
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}

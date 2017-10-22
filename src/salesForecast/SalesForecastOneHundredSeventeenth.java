package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredSeventeenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//117-����������� ������� �� ������� ������
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� ��
		centersPage.addCenterThisMonth(driver);
				
		//��������� "������� �������"
		pvPage.optionPv(driver);
		
		//��������� "������� �� ������� ������"
		pvPage.buttonSalesPeriodOpen.click();
		
		//��������� ���������
		Thread.sleep(3000);
		if (partGrafikPeriod.equals(pvPage.labelSalesPeriodTitle.getText()))
			System.out.println("SalesForecast One hundred seventeenth test is pass");
			else
				System.out.println("SalesForecast One hundred seventeenth test is false");
		
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

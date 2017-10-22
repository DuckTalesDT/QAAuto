package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastFortyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//45-�������� ������� ����������� %
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
		
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
				
		//��������� ��
		centersPage.addCenterThisMonth(driver);
				
		//�������� "������� �������"
		pvPage.optionPv(driver);
				
		//������ �������� � ����
		pvPage.fieldPlan_1.sendKeys(empty_15);
		pvPage.fieldPlan_1.sendKeys(dataCeloe_25000);
		pvPage.labelTitle.click();
		Thread.sleep(3000);
		
		//������ �������� � �������
		pvPage.setPrognoz(driver);
		
		//�������� ���������� ����
		Thread.sleep(3000);
		int date = pvPage.countDays(driver);
		
		//������� �������� ��� ����������
		Thread.sleep(1000);
		String data_Percent = "0";
		if (date == 28)
			data_Percent = dataPercent_112;
			else if (date == 29)
				data_Percent = dataPercent_116;
				else if (date == 30)
					data_Percent = dataPercent_120;
					else if (date == 31)
						data_Percent = dataPercent_124;
						
		//��������� ���������
		if (data_Percent.equals(pvPage.fieldPlanPersent.getText()))
			System.out.println("SalesForecast Forty-fifth test is pass");
			else
				System.out.println("SalesForecast Forty-fifth test is false");
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}

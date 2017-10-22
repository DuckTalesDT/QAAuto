package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastThirtySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//37-����������� ������ �����
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
												
		//������� 3 �� �� ������� �����
		int centers;
		for (centers = 0; centers <=2; centers ++){
			centersPage.addCenterThisMonth(driver);
		}
										
		//�������� "������� �������"
		pvPage.optionPv(driver);
					
		//������ �������� ��� ������ ����� � ���������� ���
		pvPage.setTotalPlan(driver);
				
		//��������� ���������
		if (dataCeloe_3000.equals(pvPage.fieldPlanTotal.getText()))
			System.out.println("SalesForecast Thirty-seventh test is pass");
			else
				System.out.println("SalesForecast Thirty-seventh test is false");
			
		//��-���������� "����� �������"
		pvPage.buttonTotalPrognoz.click();
		Thread.sleep(3000);
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}

package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastTwentySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//22-������� ������� "�� ������� ������" ��� �������� ������ �����
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
		
		//��������� ���������
		if (centersPage.buttonBeforePeriod.isEnabled())
			System.out.println("SalesForecast Twenty-second test is pass");
			else
				System.out.println("SalesForecast Twenty-second test is false");
				
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}

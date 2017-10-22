package salesForecast;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredSecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//102-���� �������� ��� ������� �� Enter
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
		
		//������� ��
		centersPage.addCenterThisMonth(driver);
		
		//��������� "������� �������"
		pvPage.optionPv(driver);
			
		//������ �������� � ����
		pvPage.fieldPlan_1.sendKeys(dataCeloe_1000);
		pvPage.fieldPlan_1.sendKeys(Keys.ENTER);
		
		//��������� ���������
		Thread.sleep(3000);
		if (dataCeloe_1000.equals(pvPage.fieldPlan_1.getAttribute("value")))
			System.out.println("SalesForecast One hundred second test is pass");
			else
				System.out.println("SalesForecast One hundred second test is false");
				
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}

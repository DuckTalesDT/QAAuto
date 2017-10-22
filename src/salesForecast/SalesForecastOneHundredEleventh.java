package salesForecast;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredEleventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//111-������ ������� ������� �� ��������� ������������� ��������
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
		
		//������� �� �� ������� �����
		centersPage.addCenterThisMonth(driver);
										
		//�������� "������� �������"
		pvPage.optionPv(driver);
			
		//������ �������� � ����
		pvPage.fieldPlan_1.sendKeys(empty_15);
		pvPage.fieldPlan_1.sendKeys(dataCeloeMinus_1000);
		pvPage.labelTitle.click();
		Thread.sleep(3000);
			
		//������ �������� � 1-� ����
		pvPage.fieldKassa_1.sendKeys(dataMinus_1000);
		pvPage.fieldKassa_1.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
			
		//��������� ���������
		if (dataCeloe_1000.equals(pvPage.fieldPlan_1.getAttribute("value")))
			if (data_1000.equals(pvPage.fieldKassa_1.getAttribute("value")))
				System.out.println("SalesForecast One hundred eleventh test is pass");
				else
					System.out.println("SalesForecast One hundred eleventh test part �2 is false");
			else
				System.out.println("SalesForecast One hundred eleventh test part �1 is false");
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}

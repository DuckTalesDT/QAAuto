package salesForecast;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastSixtySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//66-��� �������� � ������ �� ����� ������ ������� �������� 
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
		
		//��������� ��
		centersPage.addCenterThisMonth(driver);
				
		//�������� "������� �������"
		pvPage.optionPv(driver);
	
		//������ �������� � ����
		pvPage.inputPlanFirst_1000(driver);
		
		//������ �������� � 1-� ����
		pvPage.inputKassaFirst_1000(driver);
		
		//��������� �� ����� ������
		pvPage.goAfterMonth(driver);
		
		//������ �������� � ����
		pvPage.fieldPlan_1.sendKeys(empty_15);
		pvPage.fieldPlan_1.sendKeys(dataCeloe_2000);
		pvPage.labelTitle.click();
		Thread.sleep(3000);
			
		//������ �������� � �����
		pvPage.fieldKassa_1.sendKeys(empty_15);
		pvPage.fieldKassa_1.sendKeys(data_2000);
		pvPage.fieldKassa_1.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
				
		//��������� �� ����� �����
		pvPage.goBeforeMonth(driver);
		
		//��������� ���������
		if (dataCeloe_1000.equals(pvPage.fieldPlan_1.getAttribute("value")))
			if (data_1000.equals(pvPage.fieldKassa_1.getAttribute("value")))
				{
				//��������� �� ����� ������
				pvPage.goAfterMonth(driver);
				
				//���������
				if (dataCeloe_2000.equals(pvPage.fieldPlan_1.getAttribute("value")))
					if (data_2000.equals(pvPage.fieldKassa_1.getAttribute("value")))
						System.out.println("SalesForecast Sixty-sixth test is pass");
						else
							System.out.println("SalesForecast Sixty-sixth test part �4 is false");
					else
						System.out.println("SalesForecast Sixty-sixth test part �3 is false");
				}
				else
					System.out.println("SalesForecast Sixty-sixth test part �2 is false");
			else
				System.out.println("SalesForecast Sixty-sixth test part �1 is false");
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}

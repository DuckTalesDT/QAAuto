package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredTwentyEighthPartTwo extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//128-��� ��������� ��������� ����������� ��� ������ ��������� ����������
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
				
		//�������� "������� �������"
		pvPage.optionPv(driver);
		
		//��������� ���������
		if (dataCeloe_1000.equals(pvPage.fieldPlan_1.getAttribute("value")))
			if (data_1000.equals(pvPage.fieldKassa_1.getAttribute("value")))
				{
				//��������� ����������� ����������
				pvPage.buttonKoefficientOpen.click();
				Thread.sleep(1000);
				
				//��������� ���������
				if (data_2.equals(pvPage.fieldKoefficient_1.getAttribute("value")))
					System.out.println("SalesForecast One hundred twenty-eighth test is pass");
					else
						System.out.println("SalesForecast One hundred twenty-eighth test part �3 is false");
				
				//��������� ����������� ����������
				pvPage.buttonKoefficientClose.click();
				}
				else
					System.out.println("SalesForecast One hundred twenty-eighth test part �2 is false");
			else
				System.out.println("SalesForecast One hundred twenty-eighth test part �1 is false");
				
				
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
		
	}
}

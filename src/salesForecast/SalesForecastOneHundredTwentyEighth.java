package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredTwentyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//128-��� ��������� ��������� ����������� ��� ������ ��������� ����������
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
				
		//�������� "������� �������"
		pvPage.optionPv(driver);
				
		//������ �������� � ���� �� �� 
		pvPage.inputPlanFirst_1000(driver);
		
		//������ �������� � ����� �� �� 
		pvPage.inputKassaFirst_1000(driver);
		
		//��������� ����������� ����������
		pvPage.buttonKoefficientOpen.click();
		Thread.sleep(1000);
				
		//������������� ��������
		pvPage.fieldKoefficient_1.sendKeys(empty_6);
		pvPage.fieldKoefficient_1.sendKeys(data_2);
		pvPage.fieldKoefficientSave.click();
			
		//��������� ����������� ����������
		pvPage.buttonKoefficientClose.click();
		
		//��������� ����
		driver.quit();
		
	}
}

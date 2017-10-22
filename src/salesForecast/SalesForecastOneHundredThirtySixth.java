package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredThirtySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//136-"����������� ����������" �� ��������� ������ ����� ����
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

		//������ �����
		pvPage.setPrognoz(driver);
						
		//��������� ����������� ����������
		pvPage.buttonKoefficientOpen.click();
		Thread.sleep(1000);
		
		//������������� ��������
		pvPage.fieldKoefficient_1.sendKeys(empty_6);
		pvPage.fieldKoefficient_1.sendKeys(dataX);
		pvPage.fieldKoefficientSave.click();
				
		//��������� ���������
		if (dataEmpty.equals(pvPage.fieldKoefficient_1.getText()))
			System.out.println("SalesForecast One hundred thirty-sixth test is pass");
			else
				System.out.println("SalesForecast One hundred thirty-sixth test is false");
		
		//��������� ����������� ����������
		pvPage.buttonKoefficientClose.click();
				
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}

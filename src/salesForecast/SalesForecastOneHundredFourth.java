package salesForecast;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//104-����������� ���������� �������� ��� ������� �� Enter 
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
		
		//�������� ���������� ����
		int date = pvPage.countDays(driver);
				
		//������� �������� ��� ����������
		String data = "0";
		if (date == 28)
			data = data_56000;
			else if (date == 29)
				data = data_58000;
				else if (date == 30)
					data = data_60000;
					else if (date == 31)
						data = data_62000;
		
		//������ �����
		pvPage.setPrognoz(driver);
						
		//��������� ����������� ����������
		pvPage.buttonKoefficientOpen.click();
		Thread.sleep(1000);
		
		//������������� ��������
		pvPage.fieldKoefficient_1.sendKeys(empty_6);
		pvPage.fieldKoefficient_1.sendKeys(data_2);
		pvPage.fieldKoefficient_1.sendKeys(Keys.ENTER);
						
		//��������� ���������
		if (data.equals(pvPage.fieldKoefficientSave.getText()))
			System.out.println("SalesForecast One hundred fourth test is pass");
			else
				System.out.println("SalesForecast One hundred fourth test is false");
		
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

package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundred extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//100-����������� ���������� ������ ����� ������� �������� ������ �������� 
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
		
		//��������� 3 ��
		for (int i = 0; i < 3; i++){
			centersPage.addCenterThisMonth(driver);
			}
		
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
		
		//������ ����� � ��
		pvPage.setPrognoz(driver);
		
		//���������� "����� �������"
		pvPage.buttonTotalPrognoz.click();
		Thread.sleep(1000);
						
		//��������� ����������� ����������
		pvPage.buttonKoefficientOpen.click();
		Thread.sleep(1000);
		
		//������������� ��������
		pvPage.fieldKoefficientTotal.sendKeys(empty_6);
		pvPage.fieldKoefficientTotal.sendKeys(data_2);
		pvPage.fieldKoefficientSave.click();
				
		//��������� ���������
		if (data.equals(pvPage.fieldKoefficientSaveTotal.getText()))
			{		
			//��������� ����������� ����������
			pvPage.buttonKoefficientClose.click();
			
			//��������� ��������
			driver.navigate().refresh();
			Thread.sleep(3000);
			
			//��������� ����������� ����������
			pvPage.buttonKoefficientOpen.click();
			Thread.sleep(1000);
					
			//��������� ���������
			if (data.equals(pvPage.fieldKoefficientSaveTotal.getText()))
				System.out.println("SalesForecast One hundred test is pass");
				else
					System.out.println("SalesForecast One hundred part �2 test is false");
			}
			else
				System.out.println("SalesForecast One hundred part �1 test is false");
		
		//��������� ����������� ����������
		pvPage.buttonKoefficientClose.click();
		
		//��-���������� "����� �������"
		pvPage.buttonTotalPrognoz.click();
		Thread.sleep(1000);
				
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}

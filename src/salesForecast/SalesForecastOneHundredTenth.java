package salesForecast;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredTenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//110-����������� �������� � ������� ������� c ���������� ������� "�����" 0
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
		
		//�������� ���������� ���� � ������
		int days = pvPage.countDays(driver);
				
		//������� �������� ��� ����������
		Thread.sleep(1000);
		String data = "0";
		if (days == 28)
			data = "14 300,00";
			else if (days == 30)
				data = "15 300,00";
				else if (days == 31)
					data = "15 800,00";
				
		//������ �������� � �����
		pvPage.fieldKassa_1.sendKeys(data_1000);
		pvPage.fieldKassa_1.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		pvPage.fieldKassa_2.sendKeys(data_0);
		pvPage.fieldKassa_2.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		pvPage.fieldKassa_3.sendKeys(data_1000);
		pvPage.fieldKassa_3.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		pvPage.fieldKassa_4.sendKeys(data_0);
		pvPage.fieldKassa_4.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		pvPage.fieldKassa_5.sendKeys(data_1000);
		pvPage.fieldKassa_5.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		pvPage.fieldKassa_6.sendKeys(data_0);
		pvPage.fieldKassa_6.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		pvPage.fieldKassa_7.sendKeys(data_1000);
		pvPage.fieldKassa_7.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		//������������� �������������� �� 5-� ������ ����
		pvPage.fieldDayPrognoz.sendKeys(empty_2);
		pvPage.fieldDayPrognoz.sendKeys(dateDays_5);
		pvPage.fieldDayPrognoz.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		//��������� ���������
		if (data.equals(pvPage.fieldPrognoz_1.getText()))
			System.out.println("SalesForecast One hundred tenth test is pass");
			else
				System.out.println("SalesForecast One hundred tenth test is false");
				
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}

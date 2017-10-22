package salesForecast;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredTwelfth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//112-���������� "��������������  ��:" 0 ���� �� ��������
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
		
		//������ �������
		pvPage.setPrognoz(driver);
					
		//������������� �������������� �� 57 ������ ����
		pvPage.fieldDayPrognoz.sendKeys(empty_2);
		pvPage.fieldDayPrognoz.sendKeys(dateDays_0);
		pvPage.fieldDayPrognoz.sendKeys(Keys.ENTER);
				
		//��������� ���������
		Thread.sleep(3000);
		if (!dateDays_0.equals(pvPage.fieldDayPrognoz.getAttribute("value")))
			System.out.println("SalesForecast One hundred twelfth test is pass");
			else
				System.out.println("SalesForecast One hundred twelfth test is false");
				
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}

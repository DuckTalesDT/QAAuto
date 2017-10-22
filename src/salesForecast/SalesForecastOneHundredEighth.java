package salesForecast;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastOneHundredEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//108-��� ��������� "��������������  ��:" <4 ���� ������ "�������" ������� ���������
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
		
		//������ �������
		pvPage.setPrognoz(driver);
			
		//������������� �������������� �� 3 ������ ����
		pvPage.fieldDayPrognoz.sendKeys(empty_2);
		pvPage.fieldDayPrognoz.sendKeys(dateDays_3);
		pvPage.fieldDayPrognoz.sendKeys(Keys.ENTER);
		
		//��������� ���������  
		Thread.sleep(3000);
		if (promptGrafikDaysSmaller.equals(pvPage.labelPromptSmallDays.getText()))
			System.out.println("SalesForecast One hundred eighth test is pass");
			else
				System.out.println("SalesForecast One hundred eighth test is false");
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}

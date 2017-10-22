package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastSeventies extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//70-��������� ��������� ��� ������������ ���� ������ ��� ������������ ������� 
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
					
		//��������� ���������
		if (promptPVEmptyCassa.equals(pvPage.fieldKassa_1.getAttribute("placeholder")))
			System.out.println("SalesForecast Seventies test is pass");
			else
				System.out.println("SalesForecast Seventies test is false");
				
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}

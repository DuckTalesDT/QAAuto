package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastSixtyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//68-����������/���������� ������� � ������� "�������"
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
		
		//�������� ���������
		pvPage.buttonGrafikBig.click();
			
		//��������� ����������
		if (partGrafik.equals(pvPage.labelGrafikTitle.getText()))
			{
			//C���������� ����
			pvPage.buttonGrafikSmall.click();
			
			//��������� ����������
			if (partPv.equals(pvPage.labelTitle.getText()))
				System.out.println("SalesForecast Sixty-eighth test is pass");
				else
					System.out.println("SalesForecast Sixty-eighth test is false");
			}
			else
				System.out.println("SalesForecast Sixty-eighth test is false");
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}

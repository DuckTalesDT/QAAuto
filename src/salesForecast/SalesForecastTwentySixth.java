package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class SalesForecastTwentySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//26-��������� � ������� ������ ����� ����� �� ��������������� � ����������� � �������
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
				
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
		
		//�������� "������� �������"
		pvPage.optionPv(driver);
		
		//������� �� �� ������� �����
		pvPage.addCenterThisMonth(driver);
		
		//�������� "������� �������"
		pvPage.optionPv(driver);
			
		//������� ����� ����� 
		if (countCenters_1 == (pvPage.countCenters(driver)))
			if (centerName.equals(pvPage.fieldCenterFirst.getText()))
				{
				//��������� "������ �����"
				centersPage.goOptionCenters(driver);
				
				//������� ��
				centersPage.deleteAllCenter(driver);
								
				//�������� "������� �������"
				if (countCenters_0 == (centersPage.countCenters(driver)))
					{
					//�������� "������� �������"
					pvPage.optionPv(driver);
						
					//��������� ���������
					//������� �����
					if (countCenters_0 == (pvPage.countCenters(driver)))
						{
						//��������� � ��������� ����� � ��������� ���
						pvPage.goAfterMonth(driver);
						
						//���������
						if (countCenters_0 == (pvPage.countCenters(driver)))
							System.out.println("SalesForecast Twenty-Sixth test is pass");
							else
								System.out.println("SalesForecast Twenty-Sixth test part �5 is false");
						}
						else
							System.out.println("SalesForecast Twenty-Sixth test part �4 is false");
					}
					else
						System.out.println("SalesForecast Twenty-Sixth test part �3 is false");
				}
				else
					System.out.println("SalesForecast Twenty-Sixth test part �2 is false");
			else
				System.out.println("SalesForecast Twenty-Sixth test part �1 is false");
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}

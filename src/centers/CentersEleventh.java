package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersEleventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//11-����� ����� � ������������ ��������� ���������
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
												
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
			
		//������� ������ 
		centersPage.deleteAllGrup(driver);
		
		//������� �� 
		centersPage.deleteAllCenter(driver);
		
		//��������� 2 �� �� ������� �����
		centersPage.addCenterThisMonth(driver);
		centersPage.addCenterThisMonth(driver);
		
		//��������� ���������
		Thread.sleep(3000);
		if (countCenters_2 == (centersPage.countCenters(driver)))
			if (centerName.equals(centersPage.fieldCenterNameFirstTable.getText()))
				if (centerName.equals(centersPage.fieldCenterNameSecondTable.getText()))
					System.out.println("Centers Eleventh test is pass");
					else
						System.out.println("Centers Eleventh test part �2 is false");
				else
					System.out.println("Centers Eleventh test part �2 is false");
			else
				System.out.println("Centers Eleventh test part �1 is false");
		
		//������� �� 
		centersPage.deleteAllCenter(driver);
						
		//��������� ����
		driver.quit();
	}

}

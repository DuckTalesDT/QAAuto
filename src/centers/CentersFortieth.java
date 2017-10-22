package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersFortieth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//40-��������� �� ������� ����� ����� ����� ����� ���� �������� ���������� �����
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
		
		//��������� �� �� ������� �����
		centersPage.addCenterBeforeMonth(driver);
				
		//��������� ���������
		Thread.sleep(3000);
		if (countCenters_1 == (centersPage.countCenters(driver)))
			if (centersBeforeMonth.equals(centersPage.labelCenterDateCreate.getText()))
				System.out.println("Centers Fortieth test is pass");
				else
					System.out.println("Centers Fortieth test part �2 is false");
			else
				System.out.println("Centers Fortieth test part �1 is false");
				
		//������� �� 
		centersPage.deleteAllCenter(driver);
						
		//��������� ����
		driver.quit();
	}

}

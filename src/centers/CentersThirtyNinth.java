package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersThirtyNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//39-��������� �� ������� ����� ����� ����� ����� ���� �������� ������� �����
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
		centersPage.addCenterThisMonth(driver);
		
		//��������� ���������
		if (countCenters_1 == (centersPage.countCenters(driver)))
			if (centersThisMonth.equals(centersPage.labelCenterDateCreate.getText()))
				System.out.println("Centers Thirty-ninth test is pass");
				else
					System.out.println("Centers Thirty-ninth test part �2 is false");
			else
				System.out.println("Centers Thirty-ninth test part �1 is false");
				
		//������� �� 
		centersPage.deleteAllCenter(driver);
						
		//��������� ����
		driver.quit();
	}

}

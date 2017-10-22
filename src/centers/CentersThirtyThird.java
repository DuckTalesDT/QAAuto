package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersThirtyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//33-�������� ������
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
						
		//��������� ������
		centersPage.addGrup(driver);
		
		//������� ������ 
		centersPage.deleteAllGrup(driver);
				
		//��������� ���������
		if (countGrups_0 == (centersPage.countGrups(driver)))
			System.out.println("Centers Thirty-third test is pass");
			else
				System.out.println("Centers Thirty-third test is false");
		
		//������� ������ 
		centersPage.deleteAllGrup(driver);
		
		//��������� ����
		driver.quit();
	}
}

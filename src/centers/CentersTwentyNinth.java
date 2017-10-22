package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersTwentyNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//29-������ � ������������ ��������� ���������
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
						
		//��������� 2 ������
		centersPage.addGrup(driver);
		centersPage.addGrup(driver);
						
		//��������� ���������
		if (countGrups_2 == (centersPage.countGrups(driver)))
			System.out.println("Centers Twenty-eighth test is pass");
			else
				System.out.println("Centers Twenty-eighth test is false");
		
		//������� ������ 
		centersPage.deleteAllGrup(driver);
		
		//��������� ����
		driver.quit();
	}
}

package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersSixtyFifthPartTwo extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//65-��� ��������� ��/������ ����������� ��� ������ ��������� ����������
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
												
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//��������� ���������
		if (countCenters_1 == (centersPage.countCenters(driver)))
			if (countGrups_1 == (centersPage.countGrups(driver)))
				System.out.println("Centers Sixty-fifth test is pass");
				else
					System.out.println("Centers Sixty-fifth test part �2 is false");
			else
				System.out.println("Centers Sixty-fifth test part �1 is false");
		
		//������� ������ 
		centersPage.deleteAllGrup(driver);
		
		//������� �� 
		centersPage.deleteAllCenter(driver);
						
		//��������� ����
		driver.quit();
		
		
	}

}

package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersTwentySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//26-��������� ������
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
				
		//��������� ���������
		if (countGrups_1 == (centersPage.countGrups(driver)))
			if (grupName.equals(centersPage.fieldGrupNameTable.getText()))
				System.out.println("Centers Twenty-sixth test is pass");
				else
					System.out.println("Centers Twenty-sixth test part �2 is false");
			else
				System.out.println("Centers Twenty-sixth test part �1 is false");
		
		//������� ������ 
		centersPage.deleteAllGrup(driver);
		
		//��������� ����
		driver.quit();
	}
}

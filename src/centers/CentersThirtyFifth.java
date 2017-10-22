package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersThirtyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//35-���������� � �������� ������
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
		
		//�������� �������
		centersPage.buttonGrupDelete.click();
										
		//������������
		centersPage.buttonDontAgreeGrupDelete.click();
						
		//��������� ���������
		if (countGrups_1 == (centersPage.countGrups(driver)))
			System.out.println("Centers Thirty-fifth test is pass");
			else
				System.out.println("Centers Thirty-fifth test is false");
		
		//������� ������ 
		centersPage.deleteAllGrup(driver);
		
		//��������� ����
		driver.quit();
	}
}

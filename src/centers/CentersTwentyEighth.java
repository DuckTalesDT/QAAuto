package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersTwentyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//28-���������� � �������� ������
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
						
		//�������� "�������� ������"
		centersPage.buttonAddGrup.click();
						
		//�������� ��������
		centersPage.fieldGrupName.sendKeys(grupName);			
				
		//�������� "������"
		centersPage.buttonGrupDontSave.click();	
		Thread.sleep(1000);
				
		//��������� ���������
		if (countGrups_0 == (centersPage.countGrups(driver)))
			System.out.println("Centers Twenty-eighth test is pass");
			else
				System.out.println("Centers Twenty-eighth test is false");
		
		//������� ������ 
		centersPage.deleteAllGrup(driver);
		
		//��������� ����
		driver.quit();
	}
}

package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersThirtyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//31-��������� ��������� ��� �������� ������  ��� ��������
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
						
		//�� �������� ��������
		//centersPage.fieldGrupName.sendKeys(grupName);			
				
		//�������� "���������"
		centersPage.buttonGrupSave.click();
				
		//��������� ���������
		Thread.sleep(1000);
		if (promptGrupNameEmpty.equals(centersPage.labelPromptEmptyName.getText()))
			System.out.println("Centers Thirty-first test is pass");
			else
				System.out.println("Centers Thirty-first test is false");
		
		//�������� "������"
		centersPage.buttonGrupDontSave.click();
		Thread.sleep(1000);
		
		//������� ������ 
		centersPage.deleteAllGrup(driver);
						
		//��������� ����
		driver.quit();
	}
}

package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersFiftyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//55-��������� ��������� ��� ���������� Max ����������� ���������� ������� ����� ��� ������ "������������"
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entrancePers(driver);
												
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
			
		//������� ������ 
		centersPage.deleteAllGrup(driver);
		
		//������� �� 
		centersPage.deleteAllCenter(driver);
		
		//�������� "�������� ����� �����"
		centersPage.buttonAddCenter.click();
		
		//��������� ���������
		if (promptCentersMore.equals(centersPage.labelPromptMoreCenter.getText()))	
			System.out.println("Centers Fifty-fifth test is pass");
			else
				System.out.println("Centers Fifty-fifth test is false");
		
		//�������� ��������
		centersPage.buttonCenterDontSaveInMessage.click();	
		
		//������� �� 
		centersPage.deleteAllCenter(driver);
						
		//��������� ����
		driver.quit();
		
	}
}

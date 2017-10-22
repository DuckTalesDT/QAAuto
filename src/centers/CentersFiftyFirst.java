package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersFiftyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//51-���������� ��������� ������� ����� ��� ������ "������������"
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
			{
			//�������� ��������
			centersPage.buttonCenterDontSaveInMessage.click();	
			
			//��������� ���������
			if (countCentersPerso == (centersPage.countCenters(driver)))	
				System.out.println("Centers Fifty-first test is pass");
				else
					System.out.println("Centers Fifty-first test part �2 is false");
			}
			else
				System.out.println("Centers Fifty-first test part �1 is false");
		
		//������� �� 
		centersPage.deleteAllCenter(driver);
						
		//��������� ����
		driver.quit();
		
	}
}

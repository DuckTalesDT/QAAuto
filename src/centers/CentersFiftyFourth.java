package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersFiftyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//54-���������� ���������� ������� ����� ��� ������ "������������"
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaxim(driver);
												
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
			
		//������� ������ 
		centersPage.deleteAllGrup(driver);
		
		//������� �� 
		centersPage.deleteAllCenterWizoutOne(driver);
		
		//��������� 24 ��
		for(int i = 0; i < 24; i++){
			centersPage.addCenterThisMonth(driver);
			}
		
		//��������� ������ ��
		centersPage.buttonAddCenter.click();
				
		//��������� ���������
		if (promptCentersMore.equals(centersPage.labelPromptMoreCenter.getText()))	
			{
			//�������� ��������
			centersPage.buttonCenterDontSaveInMessage.click();	
			
			//��������� ���������
			if (countCentersMaxim == (centersPage.countCenters(driver)))	
				System.out.println("Centers Fifty-fourth test is pass");
				else
					System.out.println("Centers Fifty-fourth test part �2 is false");
			}
			else
				System.out.println("Centers Fifty-fourth test part �1 is false");
		
		//������� �� 
		centersPage.deleteAllCenterWizoutOne(driver);
						
		//��������� ����
		driver.quit();
		
	}
}

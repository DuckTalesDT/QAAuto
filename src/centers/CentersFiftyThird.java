package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersFiftyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//53-���������� ��������� ������� ����� ��� ������ "�����������"
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptim(driver);
												
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
			
		//������� ������ 
		centersPage.deleteAllGrup(driver);
		
		//������� �� 
		centersPage.deleteAllCenterWizoutOne(driver);
		
		//��������� 9 ��
		for(int i = 0; i < 9; i++){
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
			if (countCentersOptim == (centersPage.countCenters(driver)))	
				System.out.println("Centers Fifty-third test is pass");
				else
					System.out.println("Centers Fifty-third test part �2 is false");
			}
			else
				System.out.println("Centers Fifty-third test part �1 is false");
		
		//������� �� 
		centersPage.deleteAllCenterWizoutOne(driver);
						
		//��������� ����
		driver.quit();
		
	}
}

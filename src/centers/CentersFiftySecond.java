package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersFiftySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//52-���������� ��������� ������� ����� ��� ������ "�����������"
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entranceStand(driver);
												
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
			
		//������� ������ 
		centersPage.deleteAllGrup(driver);
		
		//������� �� 
		centersPage.deleteAllCenterWizoutOne(driver);
		
		//��������� 2 ��
		for(int i = 0; i < 2; i++){
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
			if (countCentersStand == (centersPage.countCenters(driver)))	
				System.out.println("Centers Fifty-second test is pass");
				else
					System.out.println("Centers Fifty-second test part �2 is false");
			}
			else
				System.out.println("Centers Fifty-second test part �1 is false");
		
		//������� �� 
		centersPage.deleteAllCenterWizoutOne(driver);
						
		//��������� ����
		driver.quit();
		
	}
}

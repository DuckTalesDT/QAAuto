package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersFiftyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//58-��������� ��������� ��� ���������� Max ����������� ���������� ������� ����� ��� ������ "������������"
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
		
		//�������� "�������� ����� �����" ������ ��
		centersPage.buttonAddCenter.click();
				
		//��������� ���������
		if (promptCentersMore.equals(centersPage.labelPromptMoreCenter.getText()))	
			System.out.println("Centers Fifty-eighth test is pass");
			else
				System.out.println("Centers Fifty-eighth test is false");
		
		//�������� ��������
		centersPage.buttonCenterDontSaveInMessage.click();
				
		//������� �� 
		centersPage.deleteAllCenterWizoutOne(driver);
						
		//��������� ����
		driver.quit();
		
	}
}

package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersFiftySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//56-��������� ��������� ��� ���������� Max ����������� ���������� ������� ����� ��� ������ "�����������"
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
		
		//�������� "�������� ����� �����" ������ ��
		centersPage.buttonAddCenter.click();
				
		//��������� ���������
		if (promptCentersMore.equals(centersPage.labelPromptMoreCenter.getText()))	
			System.out.println("Centers Fifty-sixth test is pass");
			else
				System.out.println("Centers Fifty-sixth test is false");
		
		//�������� ��������
		centersPage.buttonCenterDontSaveInMessage.click();
				
		//������� �� 
		centersPage.deleteAllCenterWizoutOne(driver);
						
		//��������� ����
		driver.quit();
		
	}
}

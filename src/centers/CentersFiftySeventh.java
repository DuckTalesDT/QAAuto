package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersFiftySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//57-��������� ��������� ��� ���������� Max ����������� ���������� ������� ����� ��� ������ "�����������"
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
		
		//�������� "�������� ����� �����" ������ ��
		centersPage.buttonAddCenter.click();
				
		//��������� ���������
		if (promptCentersMore.equals(centersPage.labelPromptMoreCenter.getText()))	
			System.out.println("Centers Fifty-seventh test is pass");
			else
				System.out.println("Centers Fifty-seventh test is false");
		
		//�������� ��������
		centersPage.buttonCenterDontSaveInMessage.click();
				
		//������� �� 
		centersPage.deleteAllCenterWizoutOne(driver);
						
		//��������� ����
		driver.quit();
		
	}
}

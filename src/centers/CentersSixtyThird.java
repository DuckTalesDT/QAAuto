package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersSixtyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//63-��� �������� �� ������ "��������" � "�����������" ������
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
		
		//�������� "�������� ����� �����"
		centersPage.buttonAddCenter.click();
		
		//��������� ���������
		if (centerNameEmpty.equals(centersPage.fieldCenterName.getText()))
			if (centerCommentEmpty.equals(centersPage.fieldCenterComment.getText()))
				System.out.println("Centers Sixty-third test is pass");
				else
					System.out.println("Centers Sixty-third test part �2 is false");
			else
				System.out.println("Centers Sixty-third part �1 is false");
		
		//�������� "������"
		centersPage.buttonCenterDontSave.click();
		
		//������� �� 
		centersPage.deleteAllCenter(driver);
						
		//��������� ����
		driver.quit();
	}

}

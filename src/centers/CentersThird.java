package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//3-��������� ����� ����� �� ������� ����� ��� �����������
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
		
		//��������� �� �� ������� �����
		centersPage.addCenterBeforeMonth(driver);
		
		//��������� ���������
		if (countCenters_1 == (centersPage.countCenters(driver)))
			{
			//�������� ��
			centersPage.fieldCenterNameTable.click();
						
			//���������
			if (centerCommentEmpty.equals(centersPage.fieldCenterComment.getText()))
				System.out.println("Centers Third test is pass");
				else
					System.out.println("Centers Third test part �2 is false");
			}
			else
				System.out.println("Centers Third test part �1 is false");
		
		//������� �� ������ �����
		centersPage.buttonCenterOutdors.click();
		Thread.sleep(1000);
					
		//������� �� 
		centersPage.deleteAllCenter(driver);
						
		//��������� ����
		driver.quit();
	}

}

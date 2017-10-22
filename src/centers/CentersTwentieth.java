package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersTwentieth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//20-�������� ����������� � ������ �����
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
						
		//�������� �������� ������ �����
		centersPage.fieldCenterName.sendKeys(centerName);
						
		//������� ���������� "�� ������� �����"
		if (centersPage.buttonBeforePeriod.isEnabled())
			centersPage.buttonBeforePeriod.click();
		
		//�������� �����������
		centersPage.fieldCenterComment.sendKeys(centerComment);
				
		//�������� "���������"
		centersPage.buttonCenterSave.click();
		Thread.sleep(3000);		
						
		//�������� ������ ����� �����
		centersPage.fieldCenterNameTable.click();
										
		//������ ����� �����������
		centersPage.fieldCenterComment.sendKeys(empty_15);
												
		//�������� "���������"
		centersPage.buttonCenterSave.click();
		Thread.sleep(3000);
									
		//��������� ���������
		if (countCenters_1 == (centersPage.countCenters(driver)))
			{
			//�������� ��
			centersPage.fieldCenterNameTable.click();
										
			//���������
			if (centerCommentEmpty.equals(centersPage.fieldCenterComment.getText()))
				System.out.println("Centers Twenties test is pass");
				else
					System.out.println("Centers Twenties test part �2 is false");}
			else
				System.out.println("Centers Twenties test part �1 is false");
						
		//������� �� ������ �����
		centersPage.buttonCenterOutdors.click();
		Thread.sleep(1000);
				
		//������� �� 
		centersPage.deleteAllCenter(driver);
							
		//��������� ����
		driver.quit();
	}

}

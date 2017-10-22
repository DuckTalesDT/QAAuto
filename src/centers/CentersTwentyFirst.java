package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersTwentyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//21-����������� � ������ ����� ��������� ��������� �������
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
		centersPage.fieldCenterComment.sendKeys(centerCommentX);
				
		//�������� "���������"
		centersPage.buttonCenterSave.click();
		Thread.sleep(3000);		
											
		//��������� ���������
		if (countCenters_1 == (centersPage.countCenters(driver)))
			{
			//�������� ��
			centersPage.fieldCenterNameTable.click();
						
			//���������
			if (centerCommentX.equals(centersPage.fieldCenterComment.getText()))
				System.out.println("Centers Twenty-first test is pass");
				else
					System.out.println("Centers Twenty-first test part �2 is false");
			}
			else
				System.out.println("Centers Twenty-first test part �1 is false");
						
		//������� �� ������ �����
		centersPage.buttonCenterOutdors.click();
		Thread.sleep(1000);
				
		//������� �� 
		centersPage.deleteAllCenter(driver);
							
		//��������� ����
		driver.quit();
	}

}

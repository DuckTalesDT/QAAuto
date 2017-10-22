package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersFifteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//15-���������� ��������� ��������� �� ������ ����� � ��������� ���������
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
		centersPage.addCenterThisMonth(driver);
		
		//�������� ������ ����� �����
		centersPage.fieldCenterNameTable.click();
						
		//�������� ����� �������� ������ �����
		centersPage.fieldCenterName.sendKeys(empty_15);
						
		//�������� "���������"
		centersPage.buttonCenterSave.click();
		
		//�������� "��������"
		centersPage.buttonCenterDontSave.click();
		Thread.sleep(1000);
								
		//��������� ���������
		if (countCenters_1 == (centersPage.countCenters(driver)))
			if (centerName.equals(centersPage.fieldCenterNameFirstTable.getText()))
				System.out.println("Centers Fifteenth test is pass");
				else
					System.out.println("Centers Fifteenth test part �2 is false");
			else
				System.out.println("Centers Fifteenth test part �1 is false");
		
		//������� �� 
		centersPage.deleteAllCenter(driver);
						
		//��������� ����
		driver.quit();
	}

}

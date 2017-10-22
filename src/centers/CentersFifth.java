package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//5-�������� ������ ����� �� ��������� ����� 30 ��������
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
		centersPage.fieldCenterName.sendKeys(centerNameBigger);
						
		//������� ���������� "�� ������� �����"
		if (centersPage.buttonBeforePeriod.isEnabled())
			centersPage.buttonBeforePeriod.click();
				
		//�������� "���������"
		centersPage.buttonCenterSave.click();
		Thread.sleep(3000);		
		
		//��������� ���������
		Thread.sleep(3000);
		if (countCenters_1 == (centersPage.countCenters(driver)))
			if (centerNameSmaller.equals(centersPage.fieldCenterNameFirstTable.getText()))
				System.out.println("Centers Fifth test is pass");
				else
					System.out.println("Centers Fifth test part �2 is false");
			else
				System.out.println("Centers Fifth test part �1 is false");
		
		//������� �� 
		centersPage.deleteAllCenter(driver);
						
		//��������� ����
		driver.quit();
	}

}

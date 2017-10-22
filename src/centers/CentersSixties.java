package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersSixties extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//60-�������� ������ ����� ��������� ��� ������������� ��������
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
		centersPage.fieldCenterName.sendKeys(centerNameX);
						
		//������� ���������� "�� ������� �����"
		if (centersPage.buttonBeforePeriod.isEnabled())
			centersPage.buttonBeforePeriod.click();
				
		//�������� "���������"
		centersPage.buttonCenterSave.click();
		Thread.sleep(3000);		
		
		//��������� ���������
		Thread.sleep(3000);
		if (countCenters_1 == (centersPage.countCenters(driver)))
		if (centerNameX.equals(centersPage.fieldCenterNameFirstTable.getText()))
				System.out.println("Centers Sixties test is pass");
				else
					System.out.println("Centers Sixties test part �2 is false");
			else
				System.out.println("Centers Sixties test part �1 is false");
		
		//������� �� 
		centersPage.deleteAllCenter(driver);
						
		//��������� ����
		driver.quit();
	}

}

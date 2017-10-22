package centers;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersSixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//6-��������� ����� ����� ��� ������� �� "Enter"
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
						
		///�������� "Enter"
		centersPage.fieldCenterName.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
				
		//��������� ���������
		if (countCenters_1 == (centersPage.countCenters(driver)))
			if (centerName.equals(centersPage.fieldCenterNameFirstTable.getText()))
				System.out.println("Centers Sixth test is pass");
				else
					System.out.println("Centers Sixth test part �2 is false");
			else
				System.out.println("Centers Sixth test part �1 is false");
		
		//������� �� 
		centersPage.deleteAllCenter(driver);
						
		//��������� ����
		driver.quit();
	}

}

package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersFortyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//45-��� �������� ������ ��� �� ������������ � ������
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
						
		//��������� ������
		centersPage.addGrup(driver);
		
		//������� ������ 
		centersPage.deleteAllGrup(driver);
		
		//������ �������� "���������� ��������� ������ �����"
		centersPage.buttonPeriod.click();
		
		//��������� ���������
		Thread.sleep(3000);
		if (countGrups_0 == (centersPage.countGrups(driver)))
			System.out.println("Centers Forty-fifth test is pass");
			else
				System.out.println("Centers Forty-fifth test is false");
		
		//��-���������� "���������� ��������� ������ �����"
		centersPage.buttonPeriod.click();
								
		//������� ������ 
		centersPage.deleteAllGrup(driver);
						
		//��������� ����
		driver.quit();
	}

}

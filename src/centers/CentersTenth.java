package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersTenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//10-����� ��� �������� ������ �����
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
		
		//�������� �������
		centersPage.buttonCenterDelete.click();
										
		//�������� ��������
		centersPage.buttonDontAgreeCenterDelete.click();
				
		//��������� ���������
		if (countCenters_1 == (centersPage.countCenters(driver)))
			System.out.println("Centers Tenth test is pass");
			else
				System.out.println("Centers Tenth test is false");
		
		//������� �� 
		centersPage.deleteAllCenter(driver);
						
		//��������� ����
		driver.quit();
	}

}

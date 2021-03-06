package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersSeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//7-������� � ������ "������ �����" ��� �������
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
				
		//�������� "��������"
		centersPage.buttonCenterDontSave.click();
		
		//��������� ���������
		Thread.sleep(3000);
		if (countCenters_0 == (centersPage.countCenters(driver)))
			System.out.println("Centers Seventh test is pass");
			else
				System.out.println("Centers Seventh test is false");
		
		//������� �� 
		centersPage.deleteAllCenter(driver);
						
		//��������� ����
		driver.quit();
	}

}

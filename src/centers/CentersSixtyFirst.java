package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersSixtyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//61-�������� ������ ��������� ��� ������������� ��������
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
		
		//�������� "�������� ������"
		centersPage.buttonAddGrup.click();
						
		//�������� ��������
		centersPage.fieldGrupName.sendKeys(grupNameX);			
				
		//�������� "���������"
		centersPage.buttonGrupSave.click();
		Thread.sleep(3000);
		
		//��������� ���������
		Thread.sleep(3000);
		if (countGrups_1 == (centersPage.countGrups(driver)))
			if (grupNameX.equals(centersPage.fieldGrupNameTable.getText()))
				System.out.println("Centers Sixty-first test is pass");
				else
					System.out.println("Centers Sixty-first test part �2 is false");
			else
				System.out.println("Centers Sixty-first test part �1 is false");
		
		//������� ������ 
		centersPage.deleteAllGrup(driver);
						
		//��������� ����
		driver.quit();
	}

}

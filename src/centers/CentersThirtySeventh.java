package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersThirtySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//37-������� �������� ������ �� ��������
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
		
		//��������� ������
		centersPage.buttonGrupOpen.click();
		
		//������� ��������
		centersPage.fieldNewGrupName.sendKeys(empty_15);	
				
		//�������� "�������������"
		centersPage.buttonGrupRename.click();
		
		//�������� "������"
		centersPage.buttonGrupDontRename.click();
		Thread.sleep(1000);
				
		//��������� ���������
		if (countGrups_1 == (centersPage.countGrups(driver)))
			if (grupName.equals(centersPage.fieldGrupNameTable.getText()))
				System.out.println("Centers Twenty-seventh test is pass");
				else
					System.out.println("Centers Twenty-seventh test part �2 is false");
			else
				System.out.println("Centers Twenty-sixth test part �1 is false");
		
		//������� ������ 
		centersPage.deleteAllGrup(driver);
		
		//��������� ����
		driver.quit();
	}
}

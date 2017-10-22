package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersSixtySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//66-��� ��������� �� ��/������� ����������� ��� ������ ��������� ����������
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
		
		//��������� ������
		centersPage.addGrup(driver);
		
		//�������� ������ ����� �����
		centersPage.fieldCenterNameTable.click();
								
		//�������� ����� �������� ������ �����
		centersPage.fieldCenterName.sendKeys(empty_15);
		centersPage.fieldCenterName.sendKeys(centerNameNew);
						
		//�������� "���������"
		centersPage.buttonCenterSave.click();
		Thread.sleep(3000);
		
		//��������� ������
		centersPage.buttonGrupOpen.click();
				
		//�������� ����� ��������
		centersPage.fieldNewGrupName.sendKeys(empty_15);	
		centersPage.fieldNewGrupName.sendKeys(grupNameNew);			
						
		//�������� "�������������"
		centersPage.buttonGrupRename.click();
		Thread.sleep(3000);
		
		//��������� ����
		driver.close();
	
	}

}

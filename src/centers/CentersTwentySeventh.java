package centers;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersTwentySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//27-��������� ������ ��� ������� �� "Enter"
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
		centersPage.fieldGrupName.sendKeys(grupName);			
				
		//�������� "Enter"
		centersPage.fieldGrupName.sendKeys(Keys.ENTER);	
		Thread.sleep(3000);
				
		//��������� ���������
		if (countGrups_1 == (centersPage.countGrups(driver)))
			if (grupName.equals(centersPage.fieldGrupNameTable.getText()))
				System.out.println("Centers Twenty-seventh test is pass");
				else
					System.out.println("Centers Twenty-seventh test part �2 is false");
			else
				System.out.println("Centers Twenty-seventh test part �1 is false");
		
		//������� ������ 
		centersPage.deleteAllGrup(driver);
		
		//��������� ����
		driver.quit();
	}
}

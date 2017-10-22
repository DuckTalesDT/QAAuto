package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersSixtyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//64-��� �������� ������ ������ "��������" ������
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
		
		//��������� ���������
		if (centerNameEmpty.equals(centersPage.fieldGrupName.getText()))
			System.out.println("Centers Sixty-fourth test is pass");
			else
				System.out.println("Centers Sixty-fourth is false");
		
		//�������� "������"
		centersPage.buttonGrupDontSave.click();
		
		//������� ������ 
		centersPage.deleteAllGrup(driver);
						
		//��������� ����
		driver.quit();
	}

}

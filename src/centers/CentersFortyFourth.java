package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersFortyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//44-���� �������� ������ �� ����� ��������
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
				
		//��������� ���������
		if (grupsMonth.equals(centersPage.labelGrupDateCreate.getText()))
			System.out.println("Centers Forty-fourth test is pass");
			else
				System.out.println("Centers Forty-fourth test is false");
									
		//������� ������ 
		centersPage.deleteAllGrup(driver);
						
		//��������� ����
		driver.quit();
	}

}

package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersTwentyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//25-������� ������� "�� ������� ������" ��� �������� ������ �����
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
												
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
				
		//�������� "�������� ����� �����"
		centersPage.buttonAddCenter.click();
										
		//��������� ���������
		if (centersPage.buttonBeforePeriod.isEnabled())
			System.out.println("Centers Twenty-fifth test is pass");
			else
				System.out.println("Centers Twenty-fifth test is false");
		
		//��������� ����
		driver.quit();
	}

}

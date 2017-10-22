package rate;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.UsersPage;
import forTests.Variables;

public class RateOneHundredFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//101-������� �� ����� "������������" � ������ ���������� ������� �� Max ���������� ������� ����� �� ��������
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
		CentersPage centersPage = new CentersPage();
		UsersPage usersPage = new UsersPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
		
		//��������� "������������ ��������"
		usersPage.goOptionUsers(driver);
												
		//������� ������������� 
		usersPage.deleteAllUserSecond(driver);
				
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
		
		//������� �� 
		centersPage.deleteAllCenter(driver);
		
		//��������� 1 ��
		centersPage.addCenterThisMonth(driver);
				
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
		
		//��������� �� ����� ������������
		tarifPage.changeTarifPers(driver);	
		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//��������� ���������
		if (driver.findElements(By.xpath(tarifBack)).size() == 0)
			System.out.println("Rate One hundred first test is pass");
			else
				{
				System.out.println("Rate One hundred first test is false");
			
				//������ ����� �� ������������
				tarifPage.changeTarifMaxim(driver);	
				}								
				
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� 
		centersPage.deleteAllCenter(driver);
					
		//��������� ����
		driver.quit();	
	}

}

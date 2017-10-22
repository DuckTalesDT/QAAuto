package rate;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.UsersPage;
import forTests.Variables;

public class RateOneHundredFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//104-������� �� ����� "������������" � ������ ���������� ������� �� Max ���������� ������������� �� ��������
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
		UsersPage usersPage = new UsersPage();
		CentersPage centersPage = new CentersPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
								
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
				
		//������� �� 
		centersPage.deleteAllCenter(driver);
		
		//��������� "������������ ��������"
		usersPage.goOptionUsers(driver);
																
		//������� ������������� 
		usersPage.deleteAllUserSecond(driver);
				
		//��������� 1 ������������
		usersPage.addUser(driver);
						
		//��������� �� ����� ������������
		tarifPage.changeTarifPers(driver);	
		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//��������� ���������
		if (driver.findElements(By.xpath(tarifBack)).size() == 0)
			System.out.println("Rate One hundred fourth test is pass");
			else
				{
				System.out.println("Rate One hundred fourth test is false");
			
				//������ ����� �� ������������
				tarifPage.changeTarifMaxim(driver);	
				}								
				
		//��������� "������������"
		usersPage.goOptionUsers(driver);
						
		//������� ������������
		usersPage.deleteSecondUser(driver);
						
		//��������� ����
		driver.quit();	
	}

}

package rate;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.UsersPage;
import forTests.Variables;

public class RateTwentySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//26-��������� ��������� ����� �� "������������"
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
		UsersPage usersPage = new UsersPage();
		CentersPage centersPage = new CentersPage();
														
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
											
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
		
		//������ ����� �� ������������
		tarifPage.changeTarifPers(driver);
				
		//��������� �������/���������
		payPage.goOptionPay(driver);
		
		//��������� ���������
		if (textPerson.equals(payPage.labelNameTarifAfterChange.getText()))
			System.out.println("Rate Twenty-sixth test is pass");
			else
				System.out.println("Rate Twenty-sixth test is false");
		
		//���������� ����� �� ������������
		if (driver.findElements(By.xpath(tarifBack)).size() == 1)
			{	
			//������ ����� �� ������������
			tarifPage.changeTarifMaxim(driver);	
			}
																									
		//��������� ����
		driver.quit();
		
		}

}

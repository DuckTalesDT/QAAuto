package rate;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.UsersPage;
import forTests.Variables;

public class RateOneHundredTenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//110-�������� ��������� ��� �������� �� ����� "������������" � ������ ���������� ������� �� Max ���������� �������������
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		UsersPage usersPage = new UsersPage();
		CentersPage centersPage = new CentersPage();
		PayPage payPage = new PayPage();
																
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
				
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
						
		//�������� ����� "������������"
		tarifPage.buttonTarifPers.click();
							
		//�������� "�������� �������� ����"
		tarifPage.buttonChangeTarif.click();
							
		//�������� "��������"
		tarifPage.buttonAgreeChangeTarif.click();
		Thread.sleep(1000);
										
		//��������� ���������
		if (promptChangePakegeLimit.equals(tarifPage.promptChangeTarif.getText()))
			System.out.println("Rate One hundred tenth test is pass");
			else
				System.out.println("Rate One hundred tenth test is false");
		
		//��������� ����������� ���������
		tarifPage.buttonChangeTarifWindowClose.click();
		Thread.sleep(1000);
						
		//���������� ����� �� ������������
		payPage.goOptionPay(driver);
		if (driver.findElements(By.xpath(tarifBack)).size() == 1)
			{	
			//������ ����� �� ������������
			tarifPage.changeTarifMaxim(driver);	
			}
		
		//��������� "������������"
		usersPage.goOptionUsers(driver);
						
		//������� 1 ������������
		usersPage.deleteSecondUser(driver);
						
		//��������� ����
		driver.quit();	
	}
}

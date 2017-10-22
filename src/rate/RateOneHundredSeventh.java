package rate;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.UsersPage;
import forTests.Variables;

public class RateOneHundredSeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//107-�������� ��������� ��� �������� �� ����� "������������" � ������ ���������� ������� �� Max ���������� ������� �����
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
		
		//��������� 1 ��
		centersPage.addCenterThisMonth(driver);
								
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
			System.out.println("Rate One hundred seventh test is pass");
			else
				System.out.println("Rate One hundred seventh test is false");
		
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
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
							
		//������� �� 
		centersPage.deleteAllCenter(driver);
							
		//��������� ����
		driver.quit();	
	}

}

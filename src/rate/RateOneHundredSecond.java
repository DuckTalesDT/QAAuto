package rate;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.UsersPage;
import forTests.Variables;

public class RateOneHundredSecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//102-������� �� ����� "�����������" � ������ ���������� ������� �� Max ���������� ������������� �� ��������
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
		UsersPage usersPage = new UsersPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaxim(driver);
		
		//������� ������������� � ��
		tarifPage.deleteForChangeTarif(driver);
		
		//��������� "������������"
		usersPage.goOptionUsers(driver);
		
		//��������� 18 �������������
		for(int i = 0 ; i < 18 ; i++){
			usersPage.addUser(driver);
		}
		
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
		
		//��������� �� ����� �����������
		tarifPage.changeTarifOptim(driver);	
		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//��������� ���������
		if (driver.findElements(By.xpath(tarifBack)).size() == 0)
			System.out.println("Rate One hundred second test is pass");
			else
				{
				System.out.println("Rate One hundred second test is false");
			
				//������ ����� �� ������������
				tarifPage.changeTarifMaxim(driver);	
				}								
				
		//��������� "������������"
		usersPage.goOptionUsers(driver);
						
		//������� 18 �������������
		for(int i = 0 ; i < 18 ; i ++){
			usersPage.deleteFourthUser(driver);
		}
				
		//��������� ����
		driver.quit();	
	}

}

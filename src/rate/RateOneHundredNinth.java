package rate;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.UsersPage;
import forTests.Variables;

public class RateOneHundredNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//109-�������� ��������� ��� �������� �� ����� "�����������" � ������ ���������� ������� �� Max ���������� �������������
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		UsersPage usersPage = new UsersPage();
		PayPage payPage = new PayPage();
																
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaxim(driver);
		
		//������� ������������� � ��
		tarifPage.deleteForChangeTarif(driver);
		
		//��������� "������������"
		usersPage.goOptionUsers(driver);
		
		//��������� 4 �������������
		for(int i = 0 ; i < 4 ; i++){
			usersPage.addUser(driver);
		}
		
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
		
		//�������� ����� "�����������"
		tarifPage.buttonTarifStand.click();
							
		//�������� "�������� �������� ����"
		tarifPage.buttonChangeTarif.click();
							
		//�������� "��������"
		tarifPage.buttonAgreeChangeTarif.click();
		Thread.sleep(1000);
										
		//��������� ���������
		if (promptChangePakegeLimit.equals(tarifPage.promptChangeTarif.getText()))
			System.out.println("Rate One hundred ninth test is pass");
			else
				System.out.println("Rate One hundred ninth test is false");
		
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
						
		//������� 4 �������������
		for(int i = 0 ; i < 4 ; i ++){
			usersPage.deleteFourthUser(driver);
		}
				
		//��������� ����
		driver.quit();	
	}
}

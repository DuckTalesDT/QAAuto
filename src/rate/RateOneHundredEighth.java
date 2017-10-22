package rate;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.UsersPage;
import forTests.Variables;

public class RateOneHundredEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//108-�������� ��������� ��� �������� �� ����� "�����������" � ������ ���������� ������� �� Max ���������� �������������
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
		
		//��������� 18 �������������
		for(int i = 0 ; i < 18 ; i++){
			usersPage.addUser(driver);
		}
		
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
		
		//�������� ����� "�����������"
		tarifPage.buttonTarifOptim.click();
							
		//�������� "�������� �������� ����"
		tarifPage.buttonChangeTarif.click();
							
		//�������� "��������"
		tarifPage.buttonAgreeChangeTarif.click();
		Thread.sleep(1000);
										
		//��������� ���������
		if (promptChangePakegeLimit.equals(tarifPage.promptChangeTarif.getText()))
			System.out.println("Rate One hundred eighth test is pass");
			else
				System.out.println("Rate One hundred eighth test is false");
		
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
						
		//������� 18 �������������
		for(int i = 0 ; i < 18 ; i ++){
			usersPage.deleteFourthUser(driver);
		}
				
		//��������� ����
		driver.quit();	
	}
}

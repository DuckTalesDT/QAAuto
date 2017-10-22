package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersNinties extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//90-�������� ���������/������������ � �������� ������ ������ � ����� "��������� ������" �� ��������
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
											
		//��������� "������������ ��������"
		usersPage.goOptionUsers(driver);
		
		//������� ���� �������������
		usersPage.deleteAllUserSecond(driver);
			
		//�������� �������� ������������
		usersPage.buttonAddUser.click();
								
		//������ �������
		usersPage.fieldTelephone.sendKeys(telephone);
								
		//������ ���
		usersPage.fieldName.sendKeys(userName);
								
		//������ E-mail
		usersPage.fieldEmail.sendKeys(userMail);
						
		//������������� ���-�����������=��
		usersPage.fieldSms.sendKeys(smsYes);
				
		//������������� ����������=��
		usersPage.fieldActivity.sendKeys(userIncludYes);
								
		//�������� ���� ���������
		usersPage.buttonRolManager.click();
								
		//������ ������
		usersPage.fieldPassword.sendKeys(parol);
								
		//��������� ������ �� ���������
		usersPage.fieldRepeatPassword.sendKeys(parolNew);
								
		//�������� ���������
		usersPage.buttonSave.click();
		Thread.sleep(1000);
								
		//������������ � ������ �������������
		usersPage.buttonBackDontCreate.click();
		Thread.sleep(1000);
		
		//��������� ���������
		if (countUsers_1 == (usersPage.countUsers(driver)))
			System.out.println("AccountUsers Ninties test is pass");
			else
				System.out.println("AccountUsers Ninties test is false");
				
		//������� ������������� 
		usersPage.deleteAllUserSecond(driver);
										
		//��������� ����
		driver.quit();
	}

}

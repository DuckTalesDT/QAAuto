package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersOneHundredTwentyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//123-��� ��������� ������������/��������� ����������� ��� ������ ��������� ����������
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
											
		//��������� "������������ ��������"
		usersPage.goOptionUsers(driver);
		
		//������� ���� �������������
		usersPage.deleteAllUserSecond(driver);
		
		//��������� ���������
		usersPage.addManager(driver);
		
		//�������� �������� ������������
		usersPage.buttonAddUser.click();
										
		//������ �������
		usersPage.fieldTelephone.sendKeys(telephone);
										
		//������ ���
		usersPage.fieldName.sendKeys(userName);
										
		//������ E-mail
		usersPage.fieldEmail.sendKeys(1+userMail);
								
		//������������� ���-�����������=��
		usersPage.fieldSms.sendKeys(smsYes);
				
		//������������� ����������=��
		usersPage.fieldActivity.sendKeys(userIncludYes);
										
		//�������� ���� ������������
		usersPage.buttonRolPolzovatel.click();
										
		//������ ������
		usersPage.fieldPassword.sendKeys(parol);
										
		//��������� ������
		usersPage.fieldRepeatPassword.sendKeys(parol);
										
		//�������� ���������
		usersPage.buttonSave.click();
		Thread.sleep(3000);
						
		//������������ � ������ �������������
		usersPage.buttonBackCreate.click();
		Thread.sleep(1000);		
							
		//��������� ����
		driver.quit();
		
		
	}
}

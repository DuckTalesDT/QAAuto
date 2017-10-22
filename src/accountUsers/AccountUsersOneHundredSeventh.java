package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersOneHundredSeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//107-��������� ��������� ��� �������� ��������� � ������� ����� 6 �������� 
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
		usersPage.fieldPassword.sendKeys(parolSmaller);
						
		//��������� ������
		usersPage.fieldRepeatPassword.sendKeys(parolSmaller);
						
		//�������� ���������
		usersPage.buttonSave.click();
		Thread.sleep(1000);
						
		//��������� ���������
		if (promptParolChangeSmaller.equals(usersPage.labelPromptIncorrectData.getText()))
			System.out.println("AccountUsers One hundred seventh test is pass");
			else
				System.out.println("AccountUsers One hundred seventh test is false");
		
		//������������ � ������ �������������
		usersPage.buttonBackDontCreate.click();
		Thread.sleep(1000);
		
		//������� ������������� 
		usersPage.deleteAllUserSecond(driver);
												
		//��������� ����
		driver.quit();
			
	}
}	

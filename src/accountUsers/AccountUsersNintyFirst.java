package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersNintyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//91-��������� ��������� ��� �������� ���������/������������ � �������� ������ ������ � ����� "��������� ������"
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
		
		//��������� ���������
		if (promptIncorrectUserPasswordRepeat.equals(usersPage.labelPromptIncorrectData.getText()))
			System.out.println("AccountUsers Ninty-first test is pass");
			else
				System.out.println("AccountUsers Ninty-first test is false");
						
		//������������ � ������ �������������
		usersPage.buttonBackDontCreate.click();
			
		//������� ������������� 
		usersPage.deleteAllUserSecond(driver);
												
		//��������� ����
		driver.quit();
	}
}	

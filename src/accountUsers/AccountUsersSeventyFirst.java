package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersSeventyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//71-��������� ��������� ��� ������� ������� ��������� ������������� � ���������� E-mail
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
		usersPage.fieldEmail.sendKeys(userMail);
						
		//������������� ���-�����������=��
		usersPage.fieldSms.sendKeys(smsYes);
				
		//������������� ����������=��
		usersPage.fieldActivity.sendKeys(userIncludYes);
								
		//�������� ���� ���������
		usersPage.buttonRolManager.click();
								
		//������ ������
		usersPage.fieldPassword.sendKeys(parol);
								
		//��������� ������
		usersPage.fieldRepeatPassword.sendKeys(parol);
								
		//�������� ���������
		usersPage.buttonSave.click();
		Thread.sleep(1000);
		
		//��������� ���������
		if (promptUserMailSimilar.equals(usersPage.labelPromptIncorrectData.getText()))
			System.out.println("AccountUsers Seventy-first test is pass");
			else
				System.out.println("AccountUsers Seventy-first test is false");
										
		//������������ � ������ ������������� 
		usersPage.buttonBackDontCreate.click();
														
		//������� ������������� 
		usersPage.deleteAllUserSecond(driver);
										
		//��������� ����
		driver.quit();
	
	}

}

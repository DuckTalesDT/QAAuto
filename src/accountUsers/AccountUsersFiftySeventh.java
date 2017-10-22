package accountUsers;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersFiftySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//57-����������� ��������� ��������� �������
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
										
		//�������� ���� ������������
		usersPage.buttonRolPolzovatel.click();
										
		//������ ������
		usersPage.fieldPassword.sendKeys(parol);
										
		//��������� ������
		usersPage.fieldRepeatPassword.sendKeys(parol);
		
		//������ �����������
		usersPage.fieldComment.sendKeys(userComment);
										
		//�������� ���������
		usersPage.buttonSave.click();
		Thread.sleep(3000);
								
		//������������ � ������ �������������
		usersPage.buttonBackCreate.click();
		Thread.sleep(1000);		
						
		//��������� ������������
		usersPage.buttonNameOpen.click();
		
		//�������� �����������
		usersPage.fieldComment.sendKeys(Keys.END);
		usersPage.fieldComment.sendKeys(empty_35);
		usersPage.fieldComment.sendKeys(userCommentX);
				
		//�������� ���������
		usersPage.buttonSave.click();
		Thread.sleep(3000);
		
		//������������ � ������ �������������
		usersPage.buttonBackDontCreate.click();	
		
		//��������� ������������
		usersPage.buttonNameOpen.click();
		
		//��������� ���������
		Thread.sleep(1000);
		if (userCommentX.equals(usersPage.fieldComment.getText()))
			System.out.println("AccountUsers Fifty-seventh test is pass");
			else
				System.out.println("AccountUsers Fifty-seventh test is false");
		
		//������������ � ������ �������������
		usersPage.buttonBackDontCreate.click();	
			
		//������� ������������� 
		usersPage.deleteAllUserSecond(driver);
										
		//��������� ����
		driver.quit();
		
	}

}

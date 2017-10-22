package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersFiftyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//53-��������� ����������� "�������" �� "��" � ���������� ������������
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
		usersPage.fieldActivity.sendKeys(userIncludNo);
								
		//�������� ���� ���������
		usersPage.buttonRolManager.click();
								
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
			
		//��������� ���������
		usersPage.buttonNameOpen.click();
				
		//������ ������� �� ���
		usersPage.fieldActivity.sendKeys(userIncludNo);
				
		//�������� ���������
		usersPage.buttonSave.click();
		Thread.sleep(3000);
								
		//������������ � ������ �������������
		usersPage.buttonBackDontCreate.click();	
		Thread.sleep(1000);
		
		//��������� ���������
		Thread.sleep(1000);
		if (countUsers_2 == (usersPage.countUsers(driver)))
			if (userName.equals(usersPage.buttonName.getText()))
				if (userMail.equals(usersPage.labelEmail.getText()))
					if (telephone.equals(usersPage.labelTelephone.getText()))
						if (rolMen.equals(usersPage.labelRolFirst.getText()))
							if (userActivityNo.equals(usersPage.fieldActivityTable.getText()))
								{
								//��������� ������������
								usersPage.buttonNameOpen.click();
								
								//��������� ���������
								if (userActivityNo.equals(usersPage.fieldActivity.getText()))
									System.out.println("AccountUsers Fifty-third test is pass");
									else
										System.out.println("AccountUsers Fifty-third test part �7 is false");
								
								//������������ � ������ �������������
								usersPage.buttonBackDontCreate.click();	
								}
								else
									System.out.println("AccountUsers Fifty-third part �6 test is false");
							else
								System.out.println("AccountUsers Fifty-third part �5 test is false");
						else
							System.out.println("AccountUsers Fifty-third part �4 test is false");
					else
						System.out.println("AccountUsers Fifty-third part �3 test is false");
				else
					System.out.println("AccountUsers Fifty-third part �2 test is false");
			else
				System.out.println("AccountUsers Fifty-third part �1 test is false");
														
		//������� ������������� 
		usersPage.deleteAllUserSecond(driver);
										
		//��������� ����
		driver.quit();
	}

}

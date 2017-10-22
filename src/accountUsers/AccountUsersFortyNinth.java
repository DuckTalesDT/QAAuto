package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersFortyNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//49-��������� �������� ���-����������� �� ��  
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
						
		//������������� ���-�����������=���
		usersPage.fieldSms.sendKeys(smsNo);
				
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
		Thread.sleep(3000);
								
		//������������ � ������ �������������
		usersPage.buttonBackCreate.click();
		Thread.sleep(1000);
		
		//��������� ���������
		usersPage.buttonNameOpen.click();
		
		//�������� �������� ���-����������� �� ��  
		usersPage.fieldSms.sendKeys(smsYes);
				
		//�������� ���������
		usersPage.buttonSave.click();
		Thread.sleep(1000);
						
		//������������ � ������ �������������
		usersPage.buttonBackDontCreate.click();
		Thread.sleep(1000);
		
		//��������� ���������
		if (countUsers_2 == (usersPage.countUsers(driver)))
			if (userName.equals(usersPage.buttonName.getText()))
				if (userMail.equals(usersPage.labelEmail.getText()))
					if (telephone.equals(usersPage.labelTelephone.getText()))
						if (rolMen.equals(usersPage.labelRolFirst.getText()))
							if (userActivityYes.equals(usersPage.fieldActivityTable.getText()))
								{
								//��������� ������������
								usersPage.buttonNameOpen.click();
																
								//���������
								if (smsYes.equals(usersPage.fieldSms.getText()))
									System.out.println("AccountUsers Forty-ninth test is pass");
									else
										System.out.println("AccountUsers Forty-ninth test part �7 is false");
								
								//������������ � ������ �������������
								usersPage.buttonBackDontCreate.click();
								}
								else
									System.out.println("AccountUsers Forty-ninth test part �6 is false");
							else
								System.out.println("AccountUsers Forty-ninth test part �5 is false");
						else
							System.out.println("AccountUsers Forty-ninth test part �4 is false");
					else
						System.out.println("AccountUsers Forty-ninth test part �3 is false");
				else
					System.out.println("AccountUsers Forty-ninth test part �2 is false");
			else
				System.out.println("AccountUsers Forty-ninth test part �1 is false");
					
		//������� ������������� 
		usersPage.deleteAllUserSecond(driver);
										
		//��������� ����
		driver.quit();
						
	}

}

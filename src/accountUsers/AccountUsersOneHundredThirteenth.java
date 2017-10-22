package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersOneHundredThirteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//113-������ ����� ��������� ��� ������������� ��������
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
		usersPage.fieldPassword.sendKeys(parolX);
						
		//��������� ������
		usersPage.fieldRepeatPassword.sendKeys(parolX);
				
		//�������� ���������
		usersPage.buttonSave.click();
		Thread.sleep(3000);
				
		//������������ � ������ �������������
		usersPage.buttonBackCreate.click();
		Thread.sleep(1000);
		
		//��������� ���������
		if (countUsers_2 == (usersPage.countUsers(driver)))
			if (userName.equals(usersPage.buttonName.getText()))
				if (userMail.equals(usersPage.labelEmail.getText()))
					if (telephone.equals(usersPage.labelTelephone.getText()))
						if (rolPol.equals(usersPage.labelRolFirst.getText()))
							if (userActivityYes.equals(usersPage.fieldActivityTable.getText()))
								System.out.println("AccountUsers One hundred thirteenth test is pass");
								else
									System.out.println("AccountUsers One hundred thirteenth test part �6 is false");
							else
								System.out.println("AccountUsers One hundred thirteenth test part �5 is false");
						else
							System.out.println("AccountUsers One hundred thirteenth test part �4 is false");
					else
						System.out.println("AccountUsers One hundred thirteenth test part �3 is false");
				else
					System.out.println("AccountUsers One hundred thirteenth test part �2 is false");
			else
				System.out.println("AccountUsers One hundred thirteenth test part �1 is false");
				
		//������� ������������� 
		usersPage.deleteAllUserSecond(driver);
										
		//��������� ����
		driver.quit();
			
	}
}	

package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersOneHundredFifteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//115-��������� ������������ � �������� ���������
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
								
		//�������� ���������
		usersPage.buttonSave.click();
		Thread.sleep(3000);
			
		//���������� ������ ���������
		usersPage.fieldDostup.sendKeys(dostupZapr);
								
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
								{
								//��������� ������������
								usersPage.buttonNameOpen.click();
								
								//��������� � ������ �������
								usersPage.buttonDostup.click();
													
								//��������� ���������
								Thread.sleep(1000);
								if (dostupZapr.equals(usersPage.fieldDostup.getText()))
									System.out.println("AccountUsers one hundred fifteenth test is pass");
									else
										System.out.println("AccountUsers one hundred fifteenth test part �7 is false");
								}
								else
									System.out.println("AccountUsers one hundred fifteenth test part �6 is false");
							else
								System.out.println("AccountUsers one hundred fifteenth test part �5 is false");
						else
							System.out.println("AccountUsers one hundred fifteenth test part �4 is false");
					else
						System.out.println("AccountUsers one hundred fifteenth test part �3 is false");
				else
					System.out.println("AccountUsers one hundred fifteenth test part �2 is false");
			else
				System.out.println("AccountUsers one hundred fifteenth test part �1 is false");
				
		//������������ � ������ �������������
		usersPage.buttonBackCreate.click();
				
		//������� ������������� 
		usersPage.deleteAllUserSecond(driver);
										
		//��������� ����
		driver.quit();
	}
}

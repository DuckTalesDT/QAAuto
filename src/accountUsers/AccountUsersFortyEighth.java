package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersFortyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//48-��������� �������� ���-����������� �� ���  
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
											
		//��������� "������������ ��������"
		usersPage.goOptionUsers(driver);
		
		//������� ���� �������������
		usersPage.deleteAllUserSecond(driver);
		
		//��������� ������������
		usersPage.addPolzovatel(driver);
		
		//��������� ������������
		usersPage.buttonNameOpen.click();
		
		//�������� �������� ���-����������� �� ���  
		usersPage.fieldSms.sendKeys(smsNo);
				
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
						if (rolPol.equals(usersPage.labelRolFirst.getText()))
							if (userActivityYes.equals(usersPage.fieldActivityTable.getText()))
								{
								//��������� ������������
								usersPage.buttonNameOpen.click();
								
								//���������
								if (smsNo.equals(usersPage.fieldSms.getText()))
									System.out.println("AccountUsers Forty-eighth test is pass");
									else
										System.out.println("AccountUsers Forty-eighth test part �7 is false");
								
								//������������ � ������ �������������
								usersPage.buttonBackDontCreate.click();
								}
								else
									System.out.println("AccountUsers Forty-eighth test part �6 is false");
							else
								System.out.println("AccountUsers Forty-eighth test part �5 is false");
						else
							System.out.println("AccountUsers Forty-eighth test part �4 is false");
					else
						System.out.println("AccountUsers Forty-eighth test part �3 is false");
				else
					System.out.println("AccountUsers Forty-eighth test part �2 is false");
			else
				System.out.println("AccountUsers Forty-eighth test part �1 is false");
					
		//������� ������������� 
		usersPage.deleteAllUserSecond(driver);
										
		//��������� ����
		driver.quit();
				
	}

}

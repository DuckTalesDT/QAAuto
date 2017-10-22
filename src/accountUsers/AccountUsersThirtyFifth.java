package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersThirtyFifth extends Variables {
		
	@Test
	public void test() throws InterruptedException{
		//35-��������� ����������� "�������" �� "���"   
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
		
		//������ �������� ������� "�������" �� ���
		usersPage.fieldActivityTable.sendKeys(userActivityNo);
		Thread.sleep(1000);
		
		//��������� ���������
		if (countUsers_2 == (usersPage.countUsers(driver)))
			if (userName.equals(usersPage.buttonName.getText()))
				if (userMail.equals(usersPage.labelEmail.getText()))
					if (telephone.equals(usersPage.labelTelephone.getText()))
						if (rolMen.equals(usersPage.labelRolFirst.getText()))
							if (userActivityNo.equals(usersPage.fieldActivityTable.getText()))
								{
								//��������� ���������
								usersPage.buttonNameOpen.click();
								
								//���������
								if (userActivityNo.equals(usersPage.fieldActivity.getText()))
									System.out.println("AccountUsers Thirty-fifth test is pass");
									else
										System.out.println("AccountUsers Thirty-fifth test part �7 is false");
								
								//������������ � ������ �������������
								usersPage.buttonBackDontCreate.click();
								}
								else
									System.out.println("AccountUsers Thirty-fifth test part �6 is false");
							else
								System.out.println("AccountUsers Thirty-fifth test part �5 is false");
						else
							System.out.println("AccountUsers Thirty-fifth test part �4 is false");
					else
						System.out.println("AccountUsers Thirty-fifth test part �3 is false");
				else
					System.out.println("AccountUsers Thirty-fifth test part �2 is false");
			else
				System.out.println("AccountUsers Thirty-fifth test part �1 is false");
														
		//������� ������������� 
		usersPage.deleteAllUserSecond(driver);
										
		//��������� ����
		driver.quit();
	}

}

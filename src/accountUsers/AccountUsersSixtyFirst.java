package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersSixtyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//61-������� � ������ �������������
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
		
		//������������ � ������ �������������
		usersPage.buttonBackDontCreate.click();	
		Thread.sleep(1000);
		
		//��������� ���������
		if (partUsers.equals(usersPage.labelTitle.getText()))
			if (countUsers_1 == (usersPage.countUsers(driver)))
				System.out.println("AccountUsers Sixty-first test is pass");
				else
					System.out.println("AccountUsers Sixty-first test part �2 is false");
			else
				System.out.println("AccountUsers Sixty-first test part �1 is false");
														
		//������� ������������� 
		usersPage.deleteAllUserSecond(driver);
										
		//��������� ����
		driver.quit();
					
	}

}

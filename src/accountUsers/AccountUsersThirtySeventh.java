package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersThirtySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//37-�������� ���������
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
								
		//������� ���������
		usersPage.deleteSecondUser(driver);
		
		//��������� ���������
		Thread.sleep(1000);
		if (countUsers_1 == (usersPage.countUsers(driver)))
			System.out.println("AccountUsers Thirty-seventh test is pass");
			else
				System.out.println("AccountUsers Thirty-seventh test is false");
														
		//������� ������������� 
		usersPage.deleteAllUserSecond(driver);
										
		//��������� ����
		driver.quit();
	}
}

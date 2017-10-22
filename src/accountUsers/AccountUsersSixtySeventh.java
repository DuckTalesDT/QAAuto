package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersSixtySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//67-������������ � ���������� ������� �������� ���������
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
											
		//��������� "������������ ��������"
		usersPage.goOptionUsers(driver);
		
		//������� ���� �������������
		usersPage.deleteAllUserSecond(driver);
						
		//������� 2-� �������������
		for (int i = 0; i <= 1; i ++){
			usersPage.addUser(driver);
			}
			
		//��������� ���������
		Thread.sleep(1000);
		if (countUsers_3 == (usersPage.countUsers(driver)))
			System.out.println("AccountUsers Sixty-seventh test is pass");
			else
				System.out.println("AccountUsers Sixty-seventh test is false");
			
		//������� ������������� 
		usersPage.deleteAllUserSecond(driver);
										
		//��������� ����
		driver.quit();
		
	}

}

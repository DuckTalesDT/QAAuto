package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersSixtyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//68-������������ � ���������� ������ ���������
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
		if (countUsers_3 == (usersPage.countUsers(driver)))
			System.out.println("AccountUsers Sixty-eighth test is pass");
			else
				System.out.println("AccountUsers Sixty-eighth test is false");
			
		//������� ������������� 
		usersPage.deleteAllUserSecond(driver);
										
		//��������� ����
		driver.quit();
		
	}

}

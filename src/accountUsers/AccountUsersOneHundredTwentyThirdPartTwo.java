package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersOneHundredTwentyThirdPartTwo extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//123-��� ��������� ������������/��������� ����������� ��� ������ ��������� ����������
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
											
		//��������� "������������ ��������"
		usersPage.goOptionUsers(driver);
						
		//��������� ���������
		if (countUsers_3 == (usersPage.countUsers(driver)))
			System.out.println("AccountUsers One hundred twenty-third test is pass");
			else
				System.out.println("AccountUsers One hundred twenty-third test is false");
														
		//������� ������������� 
		usersPage.deleteAllUserSecond(driver);
												
		//��������� ����
		driver.quit();
				
				
		
	}
}

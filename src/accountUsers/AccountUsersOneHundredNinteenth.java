package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersOneHundredNinteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//119-�������� ������ ��������������
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
											
		//��������� "������������ ��������"
		usersPage.goOptionUsers(driver);
								
		//��������� ��������������
		usersPage.buttonAdminOpen.click();
		
		//��������� ���������
		if (pageProfile.equals(usersPage.labelTitle.getText()))
			{
			//������������ � ������ �������������
			usersPage.buttonBackDontCreate.click();
					
			//��������� ���������
			if (pageProfile.equals(usersPage.labelTitle.getText()))
				System.out.println("AccountUsers One hundred ninteenth test is pass");
				else
					System.out.println("AccountUsers One hundred ninteenth test is false");
			}
			else
				System.out.println("AccountUsers One hundred ninteenth test is false");
				
		//��������� ����
		driver.quit();
	}
}

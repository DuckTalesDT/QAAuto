package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersSixtyFifth extends Variables {
		
	@Test
	public void test() throws InterruptedException{
		//65-������� ������������ ��������� � ������������ ���������
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
				
		//�������� ����� ���������
		String toolTipText = usersPage.getPromptManager(driver);
								
		//��������� ���������
		if (promptManager.equals(toolTipText))
			System.out.println("AccountUsers Sixty-fifth test is pass");
			else
				System.out.println("AccountUsers Sixty-fifth test is false");
				
		//������������ � ������ �������������
		usersPage.buttonBackDontCreate.click();	
														
		//������� ������������� 
		usersPage.deleteAllUserSecond(driver);
										
		//��������� ����
		driver.quit();
		
		
	}

}

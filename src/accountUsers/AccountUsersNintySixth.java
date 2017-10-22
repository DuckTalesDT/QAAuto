package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersNintySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//96-���������� ��������� ������������� ��� ������ "������������"
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entrancePers(driver);
											
		//��������� "������������ ��������"
		usersPage.goOptionUsers(driver);
		
		//������� ���� �������������
		usersPage.deleteAllUserSecond(driver);
		
		//�������� �������� ������������ 
		usersPage.buttonAddUser.click();
		
		//��������� ���������
		if (promptUsersMore.equals(usersPage.labelPromptMoreUsers.getText()))
			{
			//�������� ��������
			usersPage.buttonDontSave.click();	
			Thread.sleep(1000);
			
			System.out.println("AccountUsers Ninty-sixth test is pass");
			}
			else
				System.out.println("AccountUsers Ninty-sixth test is false");
					
		//������� ������������� 
		usersPage.deleteAllUserSecond(driver);
										
		//��������� ����
		driver.quit();
		
	}
}	

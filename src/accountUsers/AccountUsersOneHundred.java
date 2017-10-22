package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersOneHundred extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//100-��������� ��������� ��� ���������� Max ����������� ���������� ������������� ��� ������ "������������"
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
			System.out.println("AccountUsers One hundred test is pass");
			else
				System.out.println("AccountUsers One hundred test is false");
							
		//�������� ��������
		usersPage.buttonDontSave.click();
		Thread.sleep(1000);
			
		//������� ������������� 
		usersPage.deleteAllUserSecond(driver);
										
		//��������� ����
		driver.quit();
		
	}
}	

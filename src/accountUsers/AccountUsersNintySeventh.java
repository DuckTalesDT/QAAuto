package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersNintySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//97-���������� ���������� ������������� ��� ������ "�����������"
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entranceStand(driver);
													
		//��������� "������������ ��������"
		usersPage.goOptionUsers(driver);
				
		//������� ���� �������������
		usersPage.deleteAllUserFourth(driver);
		
		//��������� 3 ������������
		for(int i = 0; i<3; i++){
			usersPage.addUser(driver);
		}
				
		//�������� �������� ������������ 
		usersPage.buttonAddUser.click();
				
		//��������� ���������
		if (promptUsersMore.equals(usersPage.labelPromptMoreUsers.getText()))
			{
			//�������� ��������
			usersPage.buttonDontSave.click();	
			Thread.sleep(1000);
					
			System.out.println("AccountUsers Ninty-seventh test is pass");
			}
			else
				System.out.println("AccountUsers Ninty-seventh test is false");
					
		//������� 3 ������������
		for(int i = 0; i<3; i++){
			usersPage.deleteFourthUser(driver);
		}
		
		//������� ������������� 
		usersPage.deleteAllUserFourth(driver);
										
		//��������� ����
		driver.quit();
		
	}
}	

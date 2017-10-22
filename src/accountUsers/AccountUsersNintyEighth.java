package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersNintyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//98-���������� ��������� ������������� ��� ������ "�����������"
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entranceOptim(driver);
												
		//��������� "������������ ��������"
		usersPage.goOptionUsers(driver);
				
		//������� ���� �������������
		usersPage.deleteAllUserFourth(driver);
		
		//��������� 17 ������������
		for(int i = 0; i<17; i++){
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
					
			System.out.println("AccountUsers Ninty-eighth test is pass");
			}
			else
				System.out.println("AccountUsers Ninty-eighth test is false");
						
		//������� 17 ������������
		for(int i = 0; i<17; i++){
			usersPage.deleteFourthUser(driver);
		}
		
		//������� ������������� 
		usersPage.deleteAllUserFourth(driver);
										
		//��������� ����
		driver.quit();
			
	}
}	

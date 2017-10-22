package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersNintyNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//99-���������� ���������� ������������� ��� ������ "������������"
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaxim(driver);
													
		//��������� "������������ ��������"
		usersPage.goOptionUsers(driver);
				
		//������� ���� �������������
		usersPage.deleteAllUserFourth(driver);
		
		//��������� 47 ������������
		for(int i = 0; i < 47; i++){
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
					
			System.out.println("AccountUsers Ninty-ninth test is pass");
			}
			else
				System.out.println("AccountUsers Ninty-ninth test is false");
		
		//������� 47 ������������
		for(int i = 0; i<47; i++){
			usersPage.deleteFourthUser(driver);
		}
						
		//������� ������������� 
		usersPage.deleteAllUserFourth(driver);
										
		//��������� ����
		driver.quit();
			
	}
}	

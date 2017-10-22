package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersOneHundredFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//101-��������� ��������� ��� ���������� Max ����������� ���������� ������������� ��� ������ "�����������"
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
			System.out.println("AccountUsers One hundred first test is pass");
			else
				System.out.println("AccountUsers One hundred first test is false");
		
		//�������� ��������
		usersPage.buttonDontSave.click();
		
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

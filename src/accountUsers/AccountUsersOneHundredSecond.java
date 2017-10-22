package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersOneHundredSecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//102-��������� ��������� ��� ���������� Max ����������� ���������� ������������� ��� ������ "�����������"
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
			System.out.println("AccountUsers One hundred second test is pass");
			else
				System.out.println("AccountUsers One hundred second test is false");
		
		//�������� ��������
		usersPage.buttonDontSave.click();
		
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

package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersOneHundredThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//103-��������� ��������� ��� ���������� Max ����������� ���������� ������������� ��� ������ "������������"
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaxim(driver);
											
		//��������� "������������ ��������"
		usersPage.goOptionUsers(driver);
								
		//������� ���� �������������
		usersPage.deleteAllUserFourth(driver);
				
		//��������� 47 ������������
		for(int i = 0; i<47; i++){
			usersPage.addUser(driver);
		}
				
		//�������� �������� ������������ 
		usersPage.buttonAddUser.click();
						
		//��������� ���������
		if (promptUsersMore.equals(usersPage.labelPromptMoreUsers.getText()))
			System.out.println("AccountUsers One hundred third test is pass");
			else
				System.out.println("AccountUsers One hundred third test is false");
		
		//�������� ��������
		usersPage.buttonDontSave.click();
		
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

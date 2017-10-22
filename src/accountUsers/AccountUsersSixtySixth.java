package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersSixtySixth extends Variables {
		
	@Test
	public void test() throws InterruptedException{
		//66-������� ������������ ��������� � ������������ ������������
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
		String toolTipText = usersPage.getPromptPolzovatel(driver);
										
		//��������� ���������
		if (promptPolzovatel.equals(toolTipText))
			System.out.println("AccountUsers Sixty-sixth test is pass");
			else
				System.out.println("AccountUsers Sixty-sixth test is false");
				
		//������������ � ������ �������������
		usersPage.buttonBackDontCreate.click();	
														
		//������� ������������� 
		usersPage.deleteAllUserSecond(driver);
										
		//��������� ����
		driver.quit();
		
	}

}

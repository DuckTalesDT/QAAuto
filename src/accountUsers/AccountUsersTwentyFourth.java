package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersTwentyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//24-�������� ������ ������������
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
											
		//��������� "������������ ��������"
		usersPage.goOptionUsers(driver);
		
		//������� ���� �������������
		usersPage.deleteAllUserSecond(driver);
			
		//��������� ���������
		usersPage.addPolzovatel(driver);
		
		//��������� ���������
		usersPage.buttonNameOpen.click();
		Thread.sleep(1000);
				
		//��������� ���������
		if (promptUserOpen.equals(usersPage.labelTitle.getText()))
			{
			//������������ � ������ �������������
			usersPage.buttonBackDontCreate.click();
			Thread.sleep(1000);
					
			//��������� ���������
			if (partUsers.equals(usersPage.labelTitle.getText()))
				System.out.println("AccountUsers Twenty-fourth test is pass");
				else
					System.out.println("AccountUsers Twenty-fourth test part �2 is false");
			}
			else
				System.out.println("AccountUsers Twenty-fourth test part �1 is false");
				
		//������� ������������� 
		usersPage.deleteAllUserSecond(driver);
								
		//��������� ����
		driver.quit();
		
	}
}

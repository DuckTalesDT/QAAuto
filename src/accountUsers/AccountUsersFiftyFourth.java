package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersFiftyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//54-�������� �����������
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
											
		//��������� "������������ ��������"
		usersPage.goOptionUsers(driver);
		
		//������� ���� �������������
		usersPage.deleteAllUserSecond(driver);
		
		//��������� ������������
		usersPage.addPolzovatel(driver);
		
		//��������� ������������
		usersPage.buttonNameOpen.click();
		
		//������ �����������
		usersPage.fieldComment.sendKeys(userComment);
		
		//�������� ���������
		usersPage.buttonSave.click();
		Thread.sleep(3000);
						
		//������������ � ������ �������������
		usersPage.buttonBackDontCreate.click();	
		
		//��������� ������������
		usersPage.buttonNameOpen.click();
		
		//��������� ���������
		if (userComment.equals(usersPage.fieldComment.getText()))
			System.out.println("AccountUsers Fifty-fourth test is pass");
			else
				System.out.println("AccountUsers Fifty-fourth test is false");
		
		//������������ � ������ �������������
		usersPage.buttonBackDontCreate.click();	
														
		//������� ������������� 
		usersPage.deleteAllUserSecond(driver);
										
		//��������� ����
		driver.quit();
		
	}

}

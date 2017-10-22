package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersOneHundredEighteenth extends Variables {
		
	@Test
	public void test() throws InterruptedException{
		//118-��� ���������� ������ ������������/��������� ��� ������ ������
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
		Thread.sleep(1000);
				
		//��������� ���������
		if (nameEmpty.equals(usersPage.fieldTelephone.getText()))
			if (nameEmpty.equals(usersPage.fieldName.getText()))
				if (nameEmpty.equals(usersPage.fieldEmail.getText()))
					if (nameEmpty.equals(usersPage.fieldPassword.getText()))
						if (nameEmpty.equals(usersPage.fieldRepeatPassword.getText()))
							System.out.println("AccountUsers One nundred eighteenth test is pass");
							else
								System.out.println("AccountUsers One nundred eighteenth test part �5 is false");
						else
							System.out.println("AccountUsers One nundred eighteenth test part �4 is false");
					else
						System.out.println("AccountUsers One nundred eighteenth test part �3 is false");
				else
					System.out.println("AccountUsers One nundred eighteenth test part �2 is false");
			else
				System.out.println("AccountUsers One nundred eighteenth test part �1 is false");
		
		//������������ � ������ �������������
		usersPage.buttonBackDontCreate.click();
			
		//������� ������������� 
		usersPage.deleteAllUserSecond(driver);
										
		//��������� ����
		driver.quit();
		
		
	}

}

package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersOneHundredTwentyFourthPartTwo extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//124-��� ��������� �� �������������/���������� ����������� ��� ������ ��������� ����������
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
											
		//��������� "������������ ��������"
		usersPage.goOptionUsers(driver);
		
		//��������� ���������
		if (rolPol.equals(usersPage.labelRolFirst.getText()))
			if (rolPol.equals(usersPage.labelRolSecond.getText()))
				{
				//��������� 1-�� ������������
				usersPage.buttonNameOpen.click();
						
				//������ ���� �� ���������
				usersPage.buttonRolManager.click();
						
				//�������� ���������
				usersPage.buttonSave.click();
				Thread.sleep(3000);
										
				//������������ � ������ �������������
				usersPage.buttonBackDontCreate.click();	
				Thread.sleep(1000);
				
				//��������� ���������
				if (rolMen.equals(usersPage.labelRolFirst.getText()))
					if (rolPol.equals(usersPage.labelRolSecond.getText()))
						System.out.println("AccountUsers One hundred twenty-fourth test is pass");
						else
							System.out.println("AccountUsers One hundred twenty-fourth test part �4 is false");
					else
						System.out.println("AccountUsers One hundred twenty-fourth test part �3 is false");
				}
				else
					System.out.println("AccountUsers One hundred twenty-fourth test part �2 is false");
			else
				System.out.println("AccountUsers One hundred twenty-fourth test part �1 is false");
			
		//������� ������������� 
		usersPage.deleteAllUserSecond(driver);
												
		//��������� ����
		driver.close();
	}
}

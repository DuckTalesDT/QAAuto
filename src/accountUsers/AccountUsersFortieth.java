package accountUsers;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersFortieth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//40-������ ��������� ��������� �� ������������ ��� �� ���������� ����� "�������"
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
		
		//������� ����� ��������
		usersPage.fieldTelephone.sendKeys(Keys.END);
		usersPage.fieldTelephone.sendKeys(empty_15);
				
		//�������� ���������
		usersPage.buttonSave.click();
		Thread.sleep(1000);
		
		//�������� ������
		usersPage.buttonBackDontCreate.click();
		Thread.sleep(3000);
				
		//��������� ���������
		if (countUsers_2 == (usersPage.countUsers(driver)))
			if (userName.equals(usersPage.buttonName.getText()))
				if (userMail.equals(usersPage.labelEmail.getText()))
					if (telephone.equals(usersPage.labelTelephone.getText()))
						if (rolPol.equals(usersPage.labelRolFirst.getText()))
							if (userActivityYes.equals(usersPage.fieldActivityTable.getText()))
								{
								//��������� ������������
								usersPage.buttonNameOpen.click();
																
								//���������
								if (telephone.equals(usersPage.fieldTelephone.getAttribute("value")))
									System.out.println("AccountUsers Fortieth test is pass");
									else
										System.out.println("AccountUsers Fortieth test part �7 is false");
								
								//������������ � ������ �������������
								usersPage.buttonBackDontCreate.click();
								}
								else
									System.out.println("AccountUsers Fortieth test part �6 is false");
							else
								System.out.println("AccountUsers Fortieth test part �5 is false");
						else
							System.out.println("AccountUsers Fortieth test part �4 is false");
					else
						System.out.println("AccountUsers Fortieth test part �3 is false");
				else
					System.out.println("AccountUsers Fortieth test part �2 is false");
			else
				System.out.println("AccountUsers Fortieth test part �1 is false");
								
		//������� ������������� 
		usersPage.deleteAllUserSecond(driver);
										
		//��������� ����
		driver.quit();
				
	}

}

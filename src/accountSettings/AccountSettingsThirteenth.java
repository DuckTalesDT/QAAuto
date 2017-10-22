package accountSettings;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class AccountSettingsThirteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//13-��������� ���� ����������
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
				
		//��������� ������ "��������� ��������"
		accountPage.goOptionAccountSettinth(driver);
							
		//�������� ����� ��������� ����
		accountPage.fieldTimeLisbon.click();
		accountPage.save(driver);
					
		//������ ��������� ���� �� ����
		if (lisbon.equals(accountPage.fieldTime.getAttribute("value")))
			{
			//������ ��������� ���� �� ����
			accountPage.fieldTimeKiev.click();
			accountPage.save(driver);
			
			//��������� ���������:
			if (kiev.equals(accountPage.fieldTime.getAttribute("value")))
				System.out.println("AccountSettings Thirteenth test is pass");
				else
					System.out.println("AccountSettings Thirteenth test part �2 is false");
			}
			else
				System.out.println("AccountSettings Thirteenth test part �1 is false");
														
		//��������� ����
		driver.quit();
	}

}

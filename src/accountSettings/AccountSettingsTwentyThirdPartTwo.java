package accountSettings;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class AccountSettingsTwentyThirdPartTwo extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//23-��� ��������� ��������� ����������� ��� ������ ��������� ����������
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
				
		//��������� ������ "��������� ��������"
		accountPage.goOptionAccountSettinth(driver);
		
		//��������� ���������:
		if (homeNew.equals(accountPage.fieldName.getAttribute("value")))
			if (accountPage.fieldRassilkaYes.isSelected())
				if (date_3.equals(accountPage.fieldDays.getAttribute("value")))
					if (lisbon.equals(accountPage.fieldTime.getAttribute("value")))
						System.out.println("AccountSettings Twenty-third test is pass");
						else
							System.out.println("AccountSettings  Twenty-third test part �4 is false");
					else
						System.out.println("AccountSettings  Twenty-third test part �3 is false");
				else
					System.out.println("AccountSettings  Twenty-third test part �2 is false");
			else
				System.out.println("AccountSettings  Twenty-third test part �1 is false");
		
		//���������� ��� �������
		accountPage.fieldName.sendKeys(empty_35);
		accountPage.fieldName.sendKeys(home);
		accountPage.fieldRassilkaNo.click();
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_60);
		accountPage.fieldTimeKiev.click();
		accountPage.save(driver);
				
		//��������� ����
		driver.quit();
		
	}

}

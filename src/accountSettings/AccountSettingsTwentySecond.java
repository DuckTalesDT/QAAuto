package accountSettings;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class AccountSettingsTwentySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//22-�������� ������� ������ �� ��������
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
				
		//��������� ������ "��������� ��������"
		accountPage.goOptionAccountSettinth(driver);
								
		//��������� ���������:
		if (checkDisabled.equals(accountPage.fieldValuta.getAttribute("disabled")))
			System.out.println("AccountSettings Twenty-second test is pass");
			else
				System.out.println("AccountSettings Twenty-second test is false");
				
		//��������� ����
		driver.quit();
	}
	
}

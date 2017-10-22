package accountSettings;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class AccountSettingsFourteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//14-������� ������ UAH
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
							
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
				
		//��������� ������ "��������� ��������"
		accountPage.goOptionAccountSettinth(driver);
									
		//��������� ���������:
		if (accountPage.fieldValutaUah.isSelected())
			System.out.println("AccountSettings Fourteenth test is pass");
			else
				System.out.println("AccountSettings Fourteenth test is false");
				
		//��������� ����
		driver.quit();
	}
	
}

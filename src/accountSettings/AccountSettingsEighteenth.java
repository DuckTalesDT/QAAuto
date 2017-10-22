package accountSettings;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class AccountSettingsEighteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 18-�������� ����������� � ������� "��������� ��������" ��������� ��� ������������� ��������
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
				
		//��������� ������ "��������� ��������"
		accountPage.goOptionAccountSettinth(driver);
						
		//�������� �������� ����������� ������� ��� ������������� ��������
		accountPage.fieldName.sendKeys(empty_35);
		accountPage.fieldName.sendKeys(homeX);
		accountPage.save(driver);
				
		//��������� ���������:
		if (homeX.equals(accountPage.fieldName.getAttribute("value")))
			System.out.println("AccountSettings Eighteenth test is pass");
			else
				System.out.println("AccountSettings Eighteenth test is false");
				
		//���������� �������� �����������
		accountPage.fieldName.sendKeys(empty_35);
		accountPage.fieldName.sendKeys(home);
		accountPage.save(driver);
				
		//��������� ����
		driver.quit();
	}

}

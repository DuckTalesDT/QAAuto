package accountSettings;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class AccountSettingsThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//3-�������� ����������� ���������
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
				
		//��������� ������ "��������� ��������"
		accountPage.goOptionAccountSettinth(driver);
								
		//������� �������� �����������
		accountPage.fieldName.sendKeys(empty_35);
		accountPage.save(driver);
				
		//��������� ���������:	
		Thread.sleep(3000);
		if (homeEmpty.equals(accountPage.fieldName.getAttribute("value")))
			System.out.println("AccountSettings Third test is pass");
			else
				System.out.println("AccountSettings Third test is false");
		
		//���������� �������� �����������
		accountPage.fieldName.sendKeys(empty_35);
		accountPage.fieldName.sendKeys(home);
		accountPage.save(driver);
									
		//��������� ����
		driver.quit();
	}

}

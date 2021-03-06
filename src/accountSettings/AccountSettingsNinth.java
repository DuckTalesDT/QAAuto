package accountSettings;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class AccountSettingsNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//9-���������� "���������� ������������� ����" > 60 �� ��������
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
				
		//��������� ������ "��������� ��������"
		accountPage.goOptionAccountSettinth(driver);
						
		//������������� �������� ����� "���������� ������������� ����" > 60
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_61);
		accountPage.save(driver);
						
		//��������� ��������
		driver.navigate().refresh();
		Thread.sleep(3000);
						
		//��������� ���������	
		if (date_60.equals(accountPage.fieldDays.getAttribute("value")))
			System.out.println("AccountSettings Ninth test is pass");
			else
				System.out.println("AccountSettings Ninth test is false");
		
		//���������� "���������� ������������� ����" = 60
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_60);
		accountPage.save(driver);
					
		//��������� ����
		driver.quit();
	}

}

package accountSettings;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class AccountSettingsFifteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//15-���������� ��������� ��� ������� "Enter"
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
				
		//��������� ������ "��������� ��������"
		accountPage.goOptionAccountSettinth(driver);
					
		//�������� ����� ��������
		accountPage.fieldName.sendKeys(empty_35);
		accountPage.fieldName.sendKeys(homeNew);
				
		//�������� ����� ���������� ������������� ���� = 3
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_3);
				
		//��������� ��������� ����� �� Enter
		accountPage.fieldName.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
							
		//��������� ���������:
		if (homeNew.equals(accountPage.fieldName.getAttribute("value")))
			if (date_3.equals(accountPage.fieldDays.getAttribute("value")))
				System.out.println("AccountSettings Fifteenth test is pass");
				else
					System.out.println("AccountSettings Fifteenth test part �2 is false");
			else
				System.out.println("AccountSettings Fifteenth test part �1 is false");
			
		//���������� �������� � ��� ��������������
		accountPage.fieldName.sendKeys(empty_35);
		accountPage.fieldName.sendKeys(home);
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_60);
		accountPage.buttonSave.click();
		
		//��������� ����
		driver.quit();
	}

}

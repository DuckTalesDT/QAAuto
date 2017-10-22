package accountSettings;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class AccountSettingsTenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//10-��������� ��������� ��� ��������� �������� �� ��������� "���������� ������������� ����" > 60
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
				
		//��������� ������ "��������� ��������"
		accountPage.goOptionAccountSettinth(driver);
							
		//������������� �������� "���������� ������������� ����" > 60
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_61);
		accountPage.save(driver);
		
		//��������� ���������: 
		if (promptCorrectDate_61.equals(accountPage.messagePrompt.getText()))
			System.out.println("AccountSettings Tenth test is pass");
			else
				System.out.println("AccountSettings Tenth test is false");
		
		//���������� "���������� ������������� ����" = 60
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_60);
		accountPage.save(driver);
										
		//��������� ����
		driver.quit();
	}
}

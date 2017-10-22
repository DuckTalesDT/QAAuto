package accountSettings;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class AccountSettingsEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//8-��������� ��������� ��� ��������� �������� �� ��������� "���������� ������������� ����" = 0
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
				
		//��������� ������ "��������� ��������"
		accountPage.goOptionAccountSettinth(driver);
					
		//������������� �������� "���������� ������������� ����" = 0
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_0);
		accountPage.save(driver);
						
		//��������� ���������: 
		if (promptCorrectDate_0.equals(accountPage.messagePrompt.getText()))
			System.out.println("AccountSettings Eighth test is pass");
			else
				System.out.println("AccountSettings Eighth test is false");
				
		//���������� ���������� ������������� ����
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_60);
		accountPage.save(driver);
										
		//��������� ����
		driver.quit();
	}

}

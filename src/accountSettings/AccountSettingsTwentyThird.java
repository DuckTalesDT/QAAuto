package accountSettings;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class AccountSettingsTwentyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//23-��� ��������� ��������� ����������� ��� ������ ��������� ����������
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
				
		//��������� ������ "��������� ��������"
		accountPage.goOptionAccountSettinth(driver);
		
		//�������� ����� ��������
		Thread.sleep(1000);
		accountPage.fieldName.sendKeys(empty_35);
		accountPage.fieldName.sendKeys(homeNew);
								
		//������������� "�������� ��������" = "��"
		accountPage.fieldRassilkaYes.click();
		
		//�������� ����� ���������� ������������� ���� = 3
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_3);
		accountPage.save(driver);
		
		//�������� ����� ��������� ����
		accountPage.fieldTimeLisbon.click();
		
		//��������� ���������
		accountPage.save(driver);
		
		//��������� ����
		driver.quit();
	
	}

}

package accountSettings;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class AccountSettingsSixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//6-"���������� ������������� ����" ��������
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
				
		//��������� ������ "��������� ��������"
		accountPage.goOptionAccountSettinth(driver);
							
		//�������� ����� ���������� ������������� ���� = 3
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_3);
		accountPage.save(driver);
							
		//������ ���������� ������������� ���� �� 7
		if (date_3.equals(accountPage.fieldDays.getAttribute("value")))
			{
			//���������� "���������� ������������� ����" = 60
			accountPage.fieldDays.sendKeys(empty_2);
			accountPage.fieldDays.sendKeys(date_60);
			accountPage.save(driver);
							
			//��������� ���������:
			Thread.sleep(3000);
			if (date_60.equals(accountPage.fieldDays.getAttribute("value")))
				System.out.println("AccountSettings Sixth test is pass");
				else
					System.out.println("AccountSettings Sixth test part �2 is false");
			}
			else
				System.out.println("AccountSettings Sixth test part �1 is false");
											
		//��������� ����
		driver.quit();
	}
}

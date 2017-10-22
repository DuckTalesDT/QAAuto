package accountSettings;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class AccountSettingsFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 5-������ "�������� ��������" ��������
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
				
		//��������� ������ "��������� ��������"
		accountPage.goOptionAccountSettinth(driver);
									
		//������������� "�������� ��������" = "��"
		accountPage.fieldRassilkaYes.click();
		accountPage.save(driver);
						
		//������ "�������� ��������" �� ���
		if (accountPage.fieldRassilkaYes.isSelected())
			{
			//������ "�������� ��������" �� ���
			accountPage.fieldRassilkaNo.click();
								
			//��������� ���������
			accountPage.save(driver);
					
			//��������� ���������
			if (accountPage.fieldRassilkaNo.isSelected())
				System.out.println("AccountSettings Fifth test is pass");
				else
					System.out.println("AccountSettings Fifth test part �2 is false");
			}
			else
				System.out.println("AccountSettings Fifth test part �1 is false");
													
		//��������� ����
		driver.quit();
	}

}

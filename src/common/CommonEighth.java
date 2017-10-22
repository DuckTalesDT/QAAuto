package common;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CommonEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 8-������� ������ "�������������� ��������"
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
																		
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
						
		//��������� "�������������� ��������"
		accountPage.optionEditingAccount(driver);
								
		//��������� ���������
		if (partEditingAccount.equals(accountPage.labelEditingAccount.getText()))
			System.out.println("Common Eighth test is pass");
			else
				System.out.println("Common Eighth test is false");
						
		//��������� ����
		driver.quit();
		
		
	}

}

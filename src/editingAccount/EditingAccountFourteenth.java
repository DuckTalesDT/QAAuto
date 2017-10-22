package editingAccount;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class EditingAccountFourteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//14-������� ������ UAH
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
							
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
				
		//��������� ������ "�������������� ��������"
		accountPage.optionEditingAccount(driver);       
									
		//��������� ���������:
		if (accountPage.fieldValutaUah.isSelected())
			System.out.println("EditingAccount Fourteenth test is pass");
			else
				System.out.println("EditingAccount Fourteenth test is false");
				
		//��������� ����
		driver.quit();
	}
	
}

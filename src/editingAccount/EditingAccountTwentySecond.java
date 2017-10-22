package editingAccount;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class EditingAccountTwentySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//22-�������� ������� ������ �� ��������
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
				
		//��������� ������ "�������������� ��������"
		accountPage.optionEditingAccount(driver);       
								
		//��������� ���������:
		if (checkDisabled.equals(accountPage.fieldValuta.getAttribute("disabled")))
			System.out.println("EditingAccount Twenty-second test is pass");
			else
				System.out.println("EditingAccount Twenty-second test is false");
				
		//��������� ����
		driver.quit();
	}
	
}

package editingAccount;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class EditingAccountEighteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 18-�������� ����������� � ������� "��������� ��������" ��������� ��� ������������� ��������
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
				
		//��������� ������ "�������������� ��������"
		accountPage.optionEditingAccount(driver);       
						
		//�������� �������� ����������� ������� ��� ������������� ��������
		accountPage.fieldName.sendKeys(empty_35);
		accountPage.fieldName.sendKeys(homeX);
		accountPage.save(driver);
				
		//��������� ���������:
		if (homeX.equals(accountPage.fieldName.getAttribute("value")))
			System.out.println("EditingAccount Eighteenth test is pass");
			else
				System.out.println("EditingAccount Eighteenth test is false");
				
		//���������� �������� �����������
		accountPage.fieldName.sendKeys(empty_35);
		accountPage.fieldName.sendKeys(home);
		accountPage.save(driver);
				
		//��������� ����
		driver.quit();
	}

}

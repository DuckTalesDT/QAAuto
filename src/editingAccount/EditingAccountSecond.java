package editingAccount;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class EditingAccountSecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//2-�������� ����������� � ������� "��������� ��������" �������� ����� �������� ������
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
				
		//��������� ������ "�������������� ��������"
		accountPage.optionEditingAccount(driver);       
					
		//�������� ����� ��������
		accountPage.fieldName.sendKeys(empty_35);
		accountPage.fieldName.sendKeys(homeNew);
		accountPage.save(driver);
		
		//������ ��������
		if (homeNew.equals(accountPage.fieldName.getAttribute("value")))
			{
			//������ �������� 
			accountPage.fieldName.sendKeys(empty_35);
			accountPage.fieldName.sendKeys(home);
			accountPage.save(driver);
			
			//��������� ���������:
			if (home.equals(accountPage.fieldName.getAttribute("value")))
				System.out.println("EditingAccount Second test is pass");
				else
					System.out.println("EditingAccount Second test part �2 is false");
			}
			else
				System.out.println("EditingAccount Second test part �1 is false");
		
		//��������� ����
		driver.quit();
	}

}

package editingAccount;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class EditingAccountThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//3-�������� ����������� ���������
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
				
		//��������� ������ "�������������� ��������"
		accountPage.optionEditingAccount(driver);       
								
		//������� �������� �����������
		accountPage.fieldName.sendKeys(empty_35);
		accountPage.save(driver);
				
		//��������� ���������:	
		Thread.sleep(3000);
		if (homeEmpty.equals(accountPage.fieldName.getAttribute("value")))
			System.out.println("EditingAccount Third test is pass");
			else
				System.out.println("EditingAccount Third test is false");
		
		//���������� �������� �����������
		accountPage.fieldName.sendKeys(empty_35);
		accountPage.fieldName.sendKeys(home);
		accountPage.save(driver);
									
		//��������� ����
		driver.quit();
	}

}

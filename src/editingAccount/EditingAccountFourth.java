package editingAccount;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class EditingAccountFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 4-�������� ����������� ���������� 30-� ���������
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
				
		//��������� ������ "�������������� ��������"
		accountPage.optionEditingAccount(driver);       
								
		//�������� �������� ����������� 31 ������
		accountPage.fieldName.sendKeys(empty_35);
		accountPage.fieldName.sendKeys(homeBigger);
			
		//��������� ���������
		accountPage.save(driver);
					
		//��������� ���������:	
		if (homeSmaller.equals(accountPage.fieldName.getText()))
			System.out.println("EditingAccount Fourth test is pass");
			else
				System.out.println("EditingAccount Fourth test is false");
		
		//���������� �������� �����������
		accountPage.fieldName.sendKeys(empty_35);
		accountPage.fieldName.sendKeys(home);
					
		//��������� ���������
		accountPage.save(driver);
								
		//��������� ����
		driver.quit();
	}

}

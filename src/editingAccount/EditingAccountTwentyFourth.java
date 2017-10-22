package editingAccount;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.Variables;

public class EditingAccountTwentyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//24- "���������� ������������� ����" �� ��������� ������ ����� ����� 
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
						
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
				
		//��������� ������ "�������������� ��������"
		accountPage.optionEditingAccount(driver);       
						
		//������������� �������� ����� "���������� ������������� ����" ���������� ������ �������
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_xxx);
		accountPage.save(driver);
						
		//��������� ��������
		driver.navigate().refresh();
		Thread.sleep(3000);
						
		//��������� ���������:
		if (date_60.equals(accountPage.fieldDays.getAttribute("value")))
			System.out.println("EditingAccount Twenty-fourth test is pass");
			else
				System.out.println("EditingAccount Twenty-fourth test is false");
		
		//���������� "���������� ������������� ����" = 60
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_60);
		accountPage.save(driver);
								
		//��������� ����
		driver.quit();
	}

}

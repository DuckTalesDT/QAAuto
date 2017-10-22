package editingAccount;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.MainPage;
import forTests.Variables;

public class EditingAccountFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//1-�������� �� �������� ������� � � ������� "��������� ��������" ���������
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
		MainPage mainPage = new MainPage();
						
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
				
		//��������� ������ "�������������� ��������"
		accountPage.optionEditingAccount(driver);       
		
		//�������� ��������
		accountPage.fieldName.sendKeys(empty_35);
		accountPage.fieldName.sendKeys(home);
		accountPage.save(driver);
		
		//�������� ����� � ������� "�������������� ��������"
		String homePart = accountPage.fieldName.getAttribute("value");
		
		//�������� ����� �� �������� �������
		Thread.sleep(1000);
		String homePage = mainPage.labelAccount.getText();
		
		//��������� ���������:
		if (homePart.equals(homePage))
			System.out.println("EditingAccount First test is pass");
			else
				System.out.println("EditingAccount First test is false");
		
		//��������� ����
		driver.quit();
	}

}

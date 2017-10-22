package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileThirtySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//36-��� ���������� �������� ���������� ������ � ����� "��������� ������" ������ �����
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
										
		//��������� ������ "�������������� �������"
		profilePage.goOptionEditingProfile(driver);
		
		//�������� ������ � ������ ��������� ������
		profilePage.buttonChangeParol .click();
		profilePage.fieldRepeatPassword.sendKeys(Keys.END);
		profilePage.fieldRepeatPassword.sendKeys(empty_15);
		profilePage.fieldRepeatPassword.sendKeys(parol);
				
		//�������� "�������� ������"
		profilePage.buttonShowRepeatPassword .click();
		
		//��������� ��������
		driver.navigate().refresh();
		Thread.sleep(3000);
				
		//��������� ���������
		if (parolPassword.equals(profilePage.fieldRepeatPassword.getAttribute("type")))
			System.out.println("EditingProfile Thirty-sixth test is pass");
			else 
				System.out.println("EditingProfile Thirty-sixth test is false");
			
		//��������� ����
		driver.quit();			
	}

}

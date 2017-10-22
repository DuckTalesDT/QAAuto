package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.PvPage;
import forTests.Variables;

public class EditingProfileThirtyThirdPartTwo extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//33-������ ������� ��������� ��� ������������� ��������
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
		PvPage pvPage = new PvPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceXParol(driver);
								
		//��������� ���������
		if (pageSistem.equals(pvPage.buttonPv.getText()))
			System.out.println("EditingProfile Thirty-third test is pass");
			else 
				System.out.println("EditingProfile Thirty-third test is false");
								
		//��������� "�������������� �������"
		profilePage.goOptionEditingProfile(driver);
				
		//���������� ������
		profilePage.buttonChangeParol.click();
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parolX);
		profilePage.fieldNewPassword.sendKeys(Keys.END);
		profilePage.fieldNewPassword.sendKeys(empty_15);
		profilePage.fieldNewPassword.sendKeys(parol);
		profilePage.fieldRepeatPassword.sendKeys(Keys.END);
		profilePage.fieldRepeatPassword.sendKeys(empty_15);
		profilePage.fieldRepeatPassword.sendKeys(parol);
		profilePage.save(driver);
				
		//��������� ����
		driver.quit();		
		
		
	}
}

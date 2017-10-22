package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileFortyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//41-��������� ��������� ��� ��������� ������ ������� ��� �� ���������� ����� "����� ������"
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
										
		//��������� ������ "�������������� �������"
		profilePage.goOptionEditingProfile(driver);
				
		//������ ������ ��� �������� ������ ������
		profilePage.buttonChangeParol.click();
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
		//profilePage.fieldNewPassword.sendKeys(Keys.END);
		//profilePage.fieldNewPassword.sendKeys(empty_11);
		//profilePage.fieldNewPassword.sendKeys(parolNew);
		profilePage.fieldRepeatPassword.sendKeys(Keys.END);
		profilePage.fieldRepeatPassword.sendKeys(empty_15);
		profilePage.fieldRepeatPassword.sendKeys(parolNew);
		profilePage.save(driver);
				
		//��������� ���������
		if (promptIncorrectParolRepeat.equals(profilePage.labelPrompt.getText()))
			System.out.println("EditingProfile Forty-first test is pass");
			else 
				System.out.println("EditingProfile Forty-first test is false");
				
		//���������� ������
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parolNew);
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

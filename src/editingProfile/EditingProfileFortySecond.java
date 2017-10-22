package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileFortySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//42-������ ������� �� �������� ��� �� ���������� ����� "��������� ������"
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
										
		//��������� ������ "�������������� �������"
		profilePage.goOptionEditingProfile(driver);
				
		//������ ������ ��� ���������� ����� "��������� ������"
		profilePage.buttonChangeParol.click();
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
		profilePage.fieldNewPassword.sendKeys(Keys.END);
		profilePage.fieldNewPassword.sendKeys(empty_15);
		profilePage.fieldNewPassword.sendKeys(parolNew);
		//profilePage.fieldRepeatPassword.sendKeys(Keys.END);
		//profilePage.fieldRepeatPassword.sendKeys(empty_11);
		//profilePage.fieldRepeatPassword.sendKeys(parol);
		profilePage.save(driver);
				
		//��������� ����
		driver.quit();
		
		
	}
}

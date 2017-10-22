package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileFortySecondPartTwo extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//42-������ ������� �� �������� ��� �� ���������� ����� "��������� ������"
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceNewParol(driver);
								
		//��������� ���������
		if (pageEntrance.equals(entrancePage.LabelEntrance.getText()))
			System.out.println("EditingProfile Forty-second test is pass");
			else 
				{
				System.out.println("EditingProfile Forty-second test is false");
				
				//��������� "�������������� �������"
				profilePage.goOptionEditingProfile(driver);
								
				//�������� "�������� ������"
				profilePage.fieldEmail.sendKeys(Keys.END);
				profilePage.fieldPassword.sendKeys(empty_15);
				profilePage.fieldPassword.sendKeys(parolNew);
				profilePage.fieldNewPassword.sendKeys(Keys.END);
				profilePage.fieldNewPassword.sendKeys(empty_15);
				profilePage.fieldNewPassword.sendKeys(parol);
				profilePage.fieldRepeatPassword.sendKeys(Keys.END);
				profilePage.fieldRepeatPassword.sendKeys(empty_15);
				profilePage.fieldRepeatPassword.sendKeys(parol);
				profilePage.save(driver);
				}
				
		//��������� ����
		driver.quit();
	}
}

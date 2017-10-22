package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileTwentySecondPartTwo extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//22-������ ������� �� �������� �� ������� ����� 6 ��������
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceSmallerParol(driver);
								
		//��������� ���������
		if (pageEntrance.equals(entrancePage.LabelEntrance.getText()))
			System.out.println("EditingProfile Twenty-second test is pass");
			else 
				{
				System.out.println("EditingProfile Twenty-second test is false");
				
				//��������� "�������������� �������"
				profilePage.goOptionEditingProfile(driver);
						
				//���������� ������
				profilePage.buttonChangeParol.click();
				profilePage.fieldPassword.sendKeys(Keys.END);
				profilePage.fieldPassword.sendKeys(empty_15);
				profilePage.fieldPassword.sendKeys(parolSmaller);
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

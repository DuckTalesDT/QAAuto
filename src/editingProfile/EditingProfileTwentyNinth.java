package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileTwentyNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//29-��� ������� "������" � ����� "��������� ������" ������ �����
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
										
		//��������� ������ "�������������� �������"
		profilePage.goOptionEditingProfile(driver);
		
		//�������� ������ � ������ ��������� ������
		profilePage.buttonChangeParol.click();
		profilePage.fieldRepeatPassword.sendKeys(Keys.END);
		profilePage.fieldRepeatPassword.sendKeys(empty_15);
		profilePage.fieldRepeatPassword.sendKeys(parol);
				
		//�������� "�������� ������"
		profilePage.buttonShowRepeatPassword.click();
				
		//��������� ���������
		if (parolText.equals(profilePage.fieldRepeatPassword.getAttribute("type")))
			{
			//�������� "������ ������"
			profilePage.buttonShowRepeatPassword.click();
			
			//���������
			if (parolPassword.equals(profilePage.fieldRepeatPassword.getAttribute("type")))		
				System.out.println("EditingProfile Twenty-ninth test is pass");
				else 
					System.out.println("EditingProfile Twenty-ninth test part �2 is false");
			}
			else 
				System.out.println("EditingProfile Twenty-ninth test part �1 is false");
			
		//��������� ����
		driver.quit();				
	}

}

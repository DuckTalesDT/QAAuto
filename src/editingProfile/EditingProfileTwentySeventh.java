package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileTwentySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//27-��� ������� "������" � ����� "������� ������" ������ �����
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
										
		//��������� ������ "�������������� �������"
		profilePage.goOptionEditingProfile(driver);
		
		//�������� ������ � ������ ������� ������
		profilePage.buttonChangeParol.click();
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
						
		//�������� "�������� ������"
		profilePage.buttonShowPassword.click();
		
		//��������� ���������
		if (parolText.equals(profilePage.fieldPassword.getAttribute("type")))
			{
			//�������� "������ ������"
			profilePage.buttonShowPassword.click();
			
			//���������
			if (parolPassword.equals(profilePage.fieldPassword.getAttribute("type")))		
				System.out.println("EditingProfile Twenty-seventh test is pass");
				else 
					System.out.println("EditingProfile Twenty-seventh test part �2 is false");
			}
			else 
				System.out.println("EditingProfile Twenty-seventh test part �1 is false");
			
		//��������� ����
		driver.quit();				
	}

}

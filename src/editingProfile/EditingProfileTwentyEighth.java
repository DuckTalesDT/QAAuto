package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileTwentyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//28-��� ������� "������" � ����� "����� ������" ������ �����
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
										
		//��������� ������ "�������������� �������"
		profilePage.goOptionEditingProfile(driver);
		
		//�������� ������ � ������ ����� ������
		profilePage.buttonChangeParol.click();
		profilePage.fieldNewPassword.sendKeys(Keys.END);
		profilePage.fieldNewPassword.sendKeys(empty_15);
		profilePage.fieldNewPassword.sendKeys(parol);
		
		//�������� "�������� ������"
		profilePage.buttonShowNewPassword.click();
				
		//��������� ���������
		if (parolText.equals(profilePage.fieldNewPassword.getAttribute("type")))
			{
			//�������� "������ ������"
			profilePage.buttonShowNewPassword.click();
						
			//���������
			if (parolPassword.equals(profilePage.fieldNewPassword.getAttribute("type")))		
				System.out.println("EditingProfile Twenty-eighth test is pass");
				else 
					System.out.println("EditingProfile Twenty-eighth test part �2 is false");
			}
			else 
				System.out.println("EditingProfile Twenty-eighth testn part �1 is false");
			
		//��������� ����
		driver.quit();		
	}

}

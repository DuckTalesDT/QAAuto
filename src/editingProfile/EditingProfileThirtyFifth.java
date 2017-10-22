package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileThirtyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//35-��� ���������� �������� ���������� ������ � ����� "����� ������" ������ �����
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
										
		//��������� ������ "�������������� �������"
		profilePage.goOptionEditingProfile(driver);
		
		//�������� ������ � ������ ����� ������
		profilePage.buttonChangeParol .click();
		profilePage.fieldNewPassword.sendKeys(Keys.END);
		profilePage.fieldNewPassword.sendKeys(empty_15);
		profilePage.fieldNewPassword.sendKeys(parol);
		
		//�������� "�������� ������"
		profilePage.buttonShowPassword .click();
		
		//��������� ��������
		driver.navigate().refresh();
		Thread.sleep(3000);
				
		//��������� ���������
		if (parolPassword.equals(profilePage.fieldNewPassword.getAttribute("type")))
			System.out.println("EditingProfile Thirty-fifth test is pass");
			else 
				System.out.println("EditingProfile Thirty-fifth test is false");
			
		//��������� ����
		driver.quit();			
	}

}

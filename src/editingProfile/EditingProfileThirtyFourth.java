package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileThirtyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//34-��� ���������� �������� ���������� ������ � ����� "������� ������" ������ �����
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
										
		//��������� ������ "�������������� �������"
		profilePage.goOptionEditingProfile(driver);
						
		//�������� ������ � ������ ������
		profilePage.buttonChangeParol .click();
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
		
		//�������� "�������� ������"
		profilePage.buttonShowPassword .click();
		
		//��������� ��������
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//��������� ���������
		if (parolPassword.equals(profilePage.fieldPassword.getAttribute("type")))
			System.out.println("EditingProfile Thirty-fourth test is pass");
			else 
				System.out.println("EditingProfile Thirty-fourth test is false");
			
		//��������� ����
		driver.quit();			
	}

}

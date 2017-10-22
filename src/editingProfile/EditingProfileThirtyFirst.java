package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileThirtyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//31-������ ������������ �������� ��� ������� �� Enter
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
										
		//��������� ������ "�������������� �������"
		profilePage.goOptionEditingProfile(driver);
		
		//�������� ����� �������
		profilePage.fieldName.sendKeys(Keys.END);
		profilePage.fieldName.sendKeys(empty_35);
		profilePage.fieldName.sendKeys(nameNew);
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
				
		//��������� ��������� ����� Enter
		profilePage.fieldName.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
				
		//��������� ���������
		if (nameNew.equals(profilePage.fieldName.getAttribute("value")))
			System.out.println("EditingProfile Thirty-first test is pass");
			else
				System.out.println("EditingProfile Thirty-first test is false");
			
		//���������� �������
		profilePage.fieldName.sendKeys(Keys.END);
		profilePage.fieldName.sendKeys(empty_35);
		profilePage.fieldName.sendKeys(name);
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
		profilePage.save(driver);
				
		// ��������� ����
		driver.quit();
	}

}

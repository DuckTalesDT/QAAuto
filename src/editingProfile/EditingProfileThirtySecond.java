package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileThirtySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//32-��� ������� ��������� ��� ������������� ��������
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
										
		//��������� ������ "�������������� �������"
		profilePage.goOptionEditingProfile(driver);
				
		//������ ��� ������������ �� ������� ��� ������������� ��������
		profilePage.fieldName.sendKeys(Keys.END);
		profilePage.fieldName.sendKeys(empty_35);
		profilePage.fieldName.sendKeys(nameX);
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
		profilePage.save(driver);
							
		//��������� ���������
		if (nameX.equals(profilePage.fieldName.getAttribute("value")))
			System.out.println("EditingProfile Thirty-second test is pass");
			else
				System.out.println("EditingProfile Thirty-second test is false");
			
		//���������� ���
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
